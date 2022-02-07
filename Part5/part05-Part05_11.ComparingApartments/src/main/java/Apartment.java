
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.price = squares * pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        
        int difference = (this.price) - (compared.price);
        if (difference < 0) {
            difference*= -1;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price > compared.price) {
            return true;
        }
        return false;
    }
    

}
