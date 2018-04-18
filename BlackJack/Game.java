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
        
        System.out.println(d);
        //reveals the dealer's up card, or the first card in the dealer's hand
        //System.out.println("The dealer's upcard is " + d.getUpCard() + ".");
        
        //shows the player their hand and its total value
        System.out.println(p1);
        
        //player's turn begins
        System.out.println("What would you like to do? " + "/n" + "0: Hit" + "/n" + "1: Stay");
        
        //if player hits:
        if (scan.nextInt() == 0)
        {
            //gives player a new card
            p1.hit();
        }
        else
        {
            p1.stay();
        }
        //player's turn ends
        
        //dealer's turn begins
        if (d.getHandTotal() < 17)
        {
            d.hit();
            d.addCard(gameDeck.deal());
        }
        else
        {
            d.stay();
        }
        //dealer's turn ends
        
    }
    
    public void determineWinner()
    {
        
    }
    
    public void endGame()
    {}
}
