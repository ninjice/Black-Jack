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
        
        //creates player class
        System.out.println("What is your name?");
        //Player p1 = new Player(scan.nextLine(), startingMoney, gameDeck.deal(), gameDeck.deal());
        p1 = new Player(scan.nextLine(), startingMoney);
        
        //creates dealer
        d = new Dealer(0);
    }
    
    public void play()
    {
        //sets up deck
        Deck gameDeck = new Deck();
        //asks the player to place a bet
        this.bettingBox = p1.bet(this.minimumBet);
        
        //initializes the player's hand
        p1.initializeHand();
        p1.addCard(gameDeck.deal());
        p1.addCard(gameDeck.deal());
        
        //initializes the dealer's hand
        d.initializeHand();
        d.addCard(gameDeck.deal());
        //System.out.println(d);
        d.addCard(gameDeck.deal());;
        
        //System.out.println(d);
        //reveals the dealer's up card, or the first card in the dealer's hand
        System.out.println("The dealer's upcard is " + d.getUpCard() + ".");
        
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
        
        
        //if the player didn't bust, dealer's turn begins
        if (p1.getHandTotal() <= 21)
        {
            
            //dealer hits until their hand totals 17, or if they bust
            while (d.getHandTotal() < 17) 
            {
                //shows the player their hand and its total value
                System.out.println(p1);
            
                //when they get a new card
                d.hit();
                d.addCard(gameDeck.deal());
            
                //tells the player if the dealer busts, and then ends the dealer's turn
                if (p1.getHandTotal() > 21)
                {
                    System.out.print(" The dealer has busted!");
                    break;
                }
            
            }
            //dealer's turn ends
        }
    
    }
    
    //takes two boolean parameters, if either of them busted, doesn't bother
    //comparing hand totals
    public void determineWinner()
    {
        
        //if the player has busted, Dealer automatically wins
        if (p1.getHandTotal() > 21)
        {
            //dealer wins the money that player bet
            d.updateWinnings(bettingBox);
            
        }
        
        //if the Dealer busted, player automatically wins
        else if (d.getHandTotal() > 21)
        {
            //player wins back double their bet
            p1.updateWinnings(bettingBox * 2);
            
        }
        
        //if neither busted, compares their hand totals
        else
        {
            //reveals player's hand
            System.out.println(p1);
            
            //reveals dealer's hand
            System.out.println(d);
            
            //compares the two hand totals
            
            //if player's hand is higher
            if(p1.getHandTotal() > d.getHandTotal())
            {
                //player wins back double their bet
                p1.updateWinnings(bettingBox * 2);
                
            }
            
            //if dealer's hand is higher
            else
            {
                //dealer wins the money that the player bet
                d.updateWinnings(bettingBox);
            
            }
        }
    }
    
    public void endGame()
    {
        System.out.println("Thanks for playing!");
    }
}

