
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        hand.stream().sorted().forEach(c -> System.out.println(c));
    }
    
    public void sortBySuit() {
        hand.sort(new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand hand) {
        return this.handValue() - hand.handValue();
    }    

    public int handValue() {
        return hand.stream().map(c -> c.getValue()).reduce(0, Integer::sum);
    }
    
}
