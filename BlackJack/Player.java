import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    //instance variables
    private String name;
    private int money;
    private int[] handTotal = {0, 0};
    private ArrayList<Card> hand;
    
    public Player(String nm, int mon)
    {
        // initialise instance variables
        this.name = nm;
        this.money = mon;
        
        hand = new ArrayList<Card>(2);
    }
    
    public void bet()
    {
        
    }
    
    public void hit()
    {
        
    }
    
    public void stay()
    {
        
    }
    
    //calculates the hand total/s
    public void calcHandTotal(){
        for (Card c : hand)
        {
            handTotal[0] = 0;
            handTotal[1] = 0;
            //if there's an ace in the hand, it could count for either 1 or 11!
            if (c.getValue() == 1)
            {
                handTotal[0] += 1;
                handTotal[1] += 11;
            }
            else
            {
                handTotal[0] += c.getValue();
                handTotal[1] += c.getValue();
            }
        }
    }
    
    //returns handTotal
    public int[] getHandTotal()
    {
        return handTotal;
    }
}
