
public class Driver{
    public static void Main()
    {
        Player p = new Player("Jay", 10000);
        
        Dealer dave = new Dealer();
        
        //p.initializeHand(deck.deal(), deck.deal());
        
        //dave.initializeHand(deck.deal(),deck.deal());
            
        System.out.println(p);
        System.out.println(dave);
        
        p.bet(1000);
        p.bet(1000);
    }
}
