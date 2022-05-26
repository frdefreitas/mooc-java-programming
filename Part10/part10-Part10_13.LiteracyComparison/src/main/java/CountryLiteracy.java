
import java.util.ArrayList;

public class CountryLiteracy implements Comparable<CountryLiteracy> {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double litPercent;
    
    public CountryLiteracy(String[] parts) {
        this.theme = parts[0].trim();
        this.ageGroup = parts[1].trim();
        String genders[] = parts[2].trim().split(" ");
        this.gender = genders[0];
        this.country = parts[3].trim();
        this.year = Integer.valueOf(parts[4].trim());
        this.litPercent = Double.valueOf(parts[5].trim());
    }
    
    public double getLitPercent() {
        return this.litPercent;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + litPercent;
    }
    
    
    @Override
    public int compareTo(CountryLiteracy countries) {
        return (int) (((this.getLitPercent() * 1000000) / 10) - ((countries.getLitPercent() * 1000000) / 10));
       
    }
}
