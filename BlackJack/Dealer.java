import java.util.ArrayList;

public class Dealer extends Player
{
    //instance variables
    private String name;
    private int money;
    private int[] handTotal = {0, 0};
    //private ArrayList<Card> dealersHand = new ArrayList<Card>(2);
    private ArrayList<Card> hand;
    public Dealer()
    {
        super("Dealer", 100000);
        hand = new ArrayList<Card>(2);
        //initializeHand();
    }
    
    public void getUpCard()
    {
        //return hand[0];
    }
    
    public void offerInsuranceBet()
    {
    
    }
}
