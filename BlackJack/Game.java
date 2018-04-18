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
        
        //sets up dealer
        
        //creates deck
        gameDeck = new Deck();
        
        //creates player class
        System.out.println("What is your name?");
        //Player p1 = new Player(scan.nextLine(), startingMoney, gameDeck.deal(), gameDeck.deal());
        p1 = new Player(scan.nextLine(), startingMoney);
        
        //creates dealer
        d = new Dealer();
        
        play();
    }
    
    public void play()
    {
        //asks the player to place a bet
        p1.bet(this.minimumBet);
        
        //initializes the player's hand
        p1.initializeHand(gameDeck.deal(), gameDeck.deal());
        
        //initializes the dealer's hand
        d.initializeHand(gameDeck.deal(), gameDeck.deal());
        
        System.out.println(d);
        //reveals the dealer's up card, or the first card in the dealer's hand
        //System.out.println("The dealer's upcard is " + d.getUpCard() + ".");
        
        //shows the player their hand and its total value
        System.out.println(p1);
        
        //gives the player two options
        System.out.println("What would you like to do? " + "/n" + "0: Hit" + "/n" + "1: Stay");
        
        //if player hits:
        if (scan.nextInt() == 0)
        {
            //gives player a new card
            p1.hit(gameDeck.deal());
        }
        else
        {
            p1.stay();
        }
        
    }
    
    public void determineWinner()
    {
        
    }
    
    public void endGame()
    {}
}
