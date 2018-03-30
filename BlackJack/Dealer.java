import java.util.ArrayList;

public class Dealer extends Player
{
    //instance variables
    private String name;
    private int money;
    private int[] handTotal = {0, 0};
    //private ArrayList<Card> dealersHand = new ArrayList<Card>(2);
    private Card[] dealersHand = new Card[3];
    public Dealer()
    {
        super("Dealer", 10000);
        
        
    }
    
    public Card getUpCard()
    {
        return dealersHand[1];
    }
    
    public void offerInsuranceBet()
    {
    
    }
}
