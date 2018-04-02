
public class Card
{
    //instance data
    private int value;//card's number
    private String suit;//card's suit
    private String rank;//Jack, Queen, King, etc.
    
    //constructor
    public Card(int val, String sut, String rnk)
    {
        this.value = val;
        this.suit = sut;   
        this.rank = rnk;
        
    }

    public int getValue()
    {
        return this.value;
    }
    
    public String getSuit()
    {
        return this.suit;
    }
    
    public String toString()
    {
        return "The " + this.rank + " of " + this.suit +", worth " + this.value;
    }
    
}
