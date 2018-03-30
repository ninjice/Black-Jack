import java.util.ArrayList;

public class Dealer extends Player
{
    //instance variables
    private String name;
    private int money;
    private int[] handTotal = {0, 0};
    private ArrayList<Card> hand;
   
    public Dealer()
    {
        // initialise instance variables
        super("Dealer", 1000);
    }
}  
