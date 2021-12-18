
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        String longestname = "";

        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String parts[] = input.split(",");
            
            if (parts[0].length() > longestname.length()) {
                longestname = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            count ++;
        }
        System.out.println("Longest name: " + longestname);
        System.out.println("Average of birth years " + ((double) sum) / count);
    }
}
