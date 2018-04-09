import java.util.Random;
import java.util.ArrayList;

public class Deck
{
    //instance data
    private ArrayList<Card> deck;//arrayList that stores all the cards
    
    public Deck()
    {
        //initializes arrayList
        deck = new ArrayList<Card>(52);
        initialize();
    }
    
    //list of values the cards will have
        int[] values = {1,2,3,4,5,6,7,8,9,10, 10, 10, 10};
        //list of suits the cards will have
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
        //list of ranks the cards will have
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            
    //method that initializes/resets the deck
    public void initialize()
    {       
        deck = new ArrayList<Card>(52);
        //creates card template
        Card temp;
        //loops through the lists and creates a card with the list values
        //as instance variables, in order.
        for (int s = 0;  s < suits.length; s++)
        {
            for (int i = 0; i < values.length; i++)
            {
                temp = new Card(values[i], suits[s], ranks[i]);
                deck.add(temp);
            }
        }
    }
    
    //there does not need to be a shuffle method, as the deal method draws from
    //the deck randomly!
    
    Random rand = new Random();
    public Card deal()
    {
        return deck.remove((int)rand.nextInt(deck.size()));
    }
    
    //prints the deck
    public void printDeck()
    {
        System.out.println(deck);
    }
}
