import java.util.ArrayList;
import java.util.Scanner;

public class Player
{
    //Sets up the scanner
    Scanner scan = new Scanner(System.in);
    
    //instance variables
    private String name;
    private int money;
    private int[] handTotal = {0, 0};
    private ArrayList<Card> hand;
    
    public Player(String nm, int mon, Card card1, Card card2)
    {
        // initialise instance variables
        this.name = nm;
        this.money = mon;
        
        //sets up hand
        hand = new ArrayList<Card>(2);
        hand.add(card1);
        hand.add(card2);
    }
    
    public int bet()
    {
        //states how much money the player has and prompts them to enter
        //the amount they would like to bet.
        System.out.println("You currently have $" + this.money + 
                            "How much would you like to bet?");
        
        //returns the value the player wants to bet
        return scan.nextInt();
    }
    
    public void hit()
    {
        System.out.println(this.name + " has decided to hit.");
    }
    
    public void stay()
    {
        System.out.println(this.name + " has decided to stay.");
    }
    
    //calculates the hand total/s
    public void calcHandTotal()
    {
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
    
    //handTotal
    public int getHandTotal()
    {
        //checks handTotal[1] first because it has the 11 value of an ace
        //does not matter if there are no aces, because in that case
        //handTotal[0] and handTotal[1] are identical
        if (handTotal[0] <= 21)
        {
            return handTotal[1];
        }
        //if handTotal[1] goes over 21, returns the lesser of the two possible
        //totals
        return handTotal[0];
        
    }
    
    //updates winnings
    public void updateWinnings(int amount)
    {
        this.money += amount;
        
    }
    //returns handTotal
    public String toString()
    {
        //returns different strings depending on whether or not there's an Ace in the player's hand
        if (this.handTotal[0] == this.handTotal[1])
        {
            return this.name + " has " + this.hand + ", a hand worth " + this.handTotal[0] + "." ;
        }
        
        return (this.name + " has " + this.hand + ", a hand worth either " +
                this.handTotal[0] +  " or " + this.handTotal[1] + ".") ;
    }
}
