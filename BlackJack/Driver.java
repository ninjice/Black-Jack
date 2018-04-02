
public class Driver
{
    

    public static void Main()
    {
        Deck deck = new Deck();
        //deck.deal();
        
        Player p = new Player("Jay", 1000);
        
        Dealer dave = new Dealer();
        
        p.initializeHand(deck.deal(), deck.deal());
        
        dave.initializeHand(deck.deal(), deck.deal());
            
        System.out.println(p);
        System.out.println(dave);
        
    }
}
