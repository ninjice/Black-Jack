import java.util.Scanner;
public class Game
{
    
    public Game(int startingMoney)
    {
        //sets up scanner
        Scanner scan = new Scanner(System.in);
        
        //sets up dealer
        
        //creates deck
        Deck gameDeck = new Deck();
        
        //creates player class
        System.out.println("What is your name?");
        //Player p1 = new Player(scan.nextLine(), startingMoney, gameDeck.deal(), gameDeck.deal());
        Player p1 = new Player(scan.nextLine(), startingMoney);
        
        
    }
    
    public static void play()
    {
        
    }
    
}
