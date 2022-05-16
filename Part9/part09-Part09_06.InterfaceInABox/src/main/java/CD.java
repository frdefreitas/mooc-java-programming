
/**
 *
 * @author frdefreitas
 */

public class CD implements Packable {
    private String artist;
    private String name;
    private int publiYear;
    
    public CD(String artist, String name, int publiYear) {
        this.artist = artist;
        this.name = name;
        this.publiYear = publiYear;
    }
    
    @Override
    public String toString() {
        return artist + ": " + name + " (" + publiYear + ")";
    }
    
    @Override
    public double weight() {
        return 0.1;
    }
}
