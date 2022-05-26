
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        int suitV = c1.getSuit().ordinal() - c2.getSuit().ordinal();
        
        if (suitV != 0) {
            return suitV;
        } else {
            return c1.getValue() - c2.getValue();
        }
        
    }
    
}
