import java.util.ArrayList;

public class Dealer extends Player
{
    //instance variables
    
    //private ArrayList<Card> dealersHand = new ArrayList<Card>(2);
    
    //private ArrayList<Card> hand;
    public Dealer(int money)
    {
        super("Dealer", money);
        
        //hand = new Card[3];
    }
    
    public Card getUpCard()
    {
        return this.hand.get(1);
    }
}
