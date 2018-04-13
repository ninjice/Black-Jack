import java.util.Scanner;
public class Game
{
    //instance variables
    private int minimumBet;
    private Player p1;
    private Dealer d;
    private int bettingBox;
    public Game(int startingMoney, int minBet)
    {
        //initializes instance variable 
        this.minimumBet = minBet;
        
        //sets up scanner
        Scanner scan = new Scanner(System.in);
        
        //sets up dealer
        
        //creates deck
        Deck gameDeck = new Deck();
        
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
        
        
        
    }
    
}
