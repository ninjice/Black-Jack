import java.util.Scanner;

public class Driver
{
    
    public static void Main(String[] Args)
    {
        //sets up
        
        //initializes scanner
        Scanner scan = new Scanner(System.in);
        
        //creates game
        Game blackJack = new Game(50, 5);
        
        
        //game begins
        while(true)
        {
            blackJack.play();
            blackJack.determineWinner();
            
            //asks the player if they want to play again
            System.out.println("Would you like to play another round? (Y/N)");
            //if they say no, ends the game; otherwise the loop continues, and another game is started
            if (scan.next().equals("N"))
            {
                blackJack.endGame();
                break;
            }
            
        }
        
    }
    
}
