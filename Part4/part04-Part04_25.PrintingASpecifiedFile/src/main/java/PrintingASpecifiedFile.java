
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which files should have its content printed?");
        
        try (Scanner readerFile = new Scanner(Paths.get(scanner.nextLine()))) {
            
            while (readerFile.hasNextLine()) {
                String row = readerFile.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage() );
        }
    }
}
