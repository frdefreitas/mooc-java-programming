
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String toBeRead = "";
        int count = 0;
        
        while (true) {
            toBeRead = scanner.nextLine();
            if (toBeRead.equals("end")) {
                break;
            }
            count++;  
        }
        System.out.println(count);
    }
}
