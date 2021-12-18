
/**
 *
 * @author Flavio
 */
public class Books {
    private String title;
    private int pages;
    private int publiYear;
    
    public Books(String title, int pages, int publiYear) {
        this.title = title;
        this.pages = pages;
        this.publiYear = publiYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int getYear() {
        return this.publiYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publiYear;
    }
    
}
