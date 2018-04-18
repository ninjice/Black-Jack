import java.util.Scanner;
public class Game
{
    //instance variables
    private Player p1;
    private Dealer d;
    private Deck gameDeck;
    private int minimumBet;
    private int bettingBox;
    public Game(int startingMoney, int minBet)
    {
        //initializes instance variable 
        this.minimumBet = minBet;
        
        //sets up scanner
        Scanner scan = new Scanner(System.in);
        
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
        System.out.println("The dealer's upcard is " + d.getUpCard() + ".");
        
    }
    
    public void determineWinner()
    {
        
    }
    
    public void endGame()
    {}
}
