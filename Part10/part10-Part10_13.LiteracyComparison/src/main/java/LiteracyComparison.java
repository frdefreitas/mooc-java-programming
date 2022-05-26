
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<CountryLiteracy> countries = new ArrayList<>();
        read("literacy.csv").stream()
                .forEach(row -> countries.add(new CountryLiteracy(row)));
        
        countries.stream().sorted((c1,c2) -> {
            return c1.compareTo(c2);
        }).forEach(c -> System.out.println(c));
        
    }
    
    public static ArrayList<String[]> read(String file) {
        ArrayList<String[]> countries = new ArrayList<>();
        
        try {
           Files.lines(Paths.get(file)).forEach(row -> countries.add(row.split(",")));
            
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return countries;
    }
}
