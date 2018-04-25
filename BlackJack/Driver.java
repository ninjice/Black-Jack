import java.util.Scanner;

public class Driver
{
    
    public static void Main(String[] Args)
    {
        //sets up
        
        //initializes scanner
        Scanner scan = new Scanner(System.in);
        
        //asks how much money player should start with
        System.out.println("How much money would you like to start with?");
        int money = scan.nextInt();
        
        //asks what minimum bet should be
        System.out.println("What should be the minimum amount you can bet?");
        int bet = scan.nextInt();
        
        //creates game
        Game blackJack = new Game(money, bet);
        
        
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
