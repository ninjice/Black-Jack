import java.util.ArrayList;
public class Deck
{
    //instance data
    private ArrayList<Card> cards;//arrayList that stores all the cards
    
    public Deck()
    {
        //initializes arrayList
        cards = new ArrayList<Card>(52);
    }
    
    //method that initializes/resets the deck
    public void initialize()
    {
        //list of values the cards will have
        int[] values = {1,2,3,4,5,6,7,8,9,10, 10, 10, 10};
        //list of suits the cards will have
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        //list of ranks the cards will have
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    }
}
