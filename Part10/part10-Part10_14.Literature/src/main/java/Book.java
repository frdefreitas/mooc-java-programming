

public class Book {
    private String title;
    private int ageRecomendation;
    
    public Book (String title, int age) {
        this.title = title;
        this.ageRecomendation = age;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getAgeRecomendation() {
        return this.ageRecomendation;
    }
    
    @Override
    public String toString() {
        return this.getTitle() + " (recommended for " + this.ageRecomendation + " year-olds or older)";
    }
}
