import java.util.Scanner;
public class Game
{
    //instance variables
    private Player p1;
    private Dealer d;
    private Deck gameDeck;
    private int minimumBet;
    private int bettingBox;
    
    //sets up scanner
    Scanner scan = new Scanner(System.in);
        
    public Game(int startingMoney, int minBet)
    {
        //initializes instance variable 
        this.minimumBet = minBet;
        
        //creates deck
        gameDeck = new Deck();
        
        //creates player class
        System.out.println("What is your name?");
        //Player p1 = new Player(scan.nextLine(), startingMoney, gameDeck.deal(), gameDeck.deal());
        p1 = new Player(scan.nextLine(), startingMoney);
        
        //creates dealer
        d = new Dealer();
        
        //begins the game
        play();
        
        //determines the winner
        determineWinner();
    }
    
    public void play()
    {
        //asks the player to place a bet
        this.bettingBox = p1.bet(this.minimumBet);
        
        //initializes the player's hand
        p1.addCard(gameDeck.deal());
        p1.addCard(gameDeck.deal());
        
        //initializes the dealer's hand
        d.addCard(gameDeck.deal());
        d.addCard(gameDeck.deal());
        
        //System.out.println(d);
        //reveals the dealer's up card, or the first card in the dealer's hand
        //System.out.println("The dealer's upcard is " + d.getUpCard() + ".");
        
        //player's turn begins
        
        //shows the player their hand and its total value
        System.out.println(p1);
        //asks player whether they want to hit or stay
        System.out.println("What would you like to do?" + "\n" + "0: Hit" + "\n" + "1: Stay");
        //player's turn continues until they either bust or stay
        while (scan.nextInt() != 1) 
        {
            //if they hit, they get a new card
            p1.hit();
            p1.addCard(gameDeck.deal());
            
            //shows the player their hand and its total value
            System.out.println(p1);
            
            //if the player busts, the program tells them and then ends their turn
            if (p1.getHandTotal() > 21)
            {
                System.out.print(" They have busted!");
                break;
            }
            
            //if the player did not bust, they are given the two options again
            System.out.println("What would you like to do? " + "\n" + 
            "0: Hit" + "\n" + "1: Stay");
        }
        p1.stay();
        //player's turn ends
        
        
        //dealer's turn begins
        
        
        
        //dealer hits until their hand totals 17, or if they bust
        while (d.getHandTotal() < 17) 
        {
            //when they get a new card
            d.hit();
            d.addCard(gameDeck.deal());
            
            //shows the player their hand and its total value
            System.out.println(p1);
            
            //tells the player if the dealer busts, and then ends the dealer's turn
            if (p1.getHandTotal() > 21)
            {
                System.out.print(" They have busted!");
                break;
            }
            
            //if the player did not bust, they are given the two options again
            System.out.println("What would you like to do? " + "\n" + 
            "0: Hit" + "\n" + "1: Stay");
        }
        //dealer's turn ends
        
    }
    
    public void determineWinner()
    {
        //reveals player's hand
        System.out.println(p1);
    }
    
    public void endGame()
    {}
}
