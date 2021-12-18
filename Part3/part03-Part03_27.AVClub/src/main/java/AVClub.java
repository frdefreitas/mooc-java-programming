
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] parts = string.split(" ");
            for (String part : parts) {
                if (part.contains("av")) {
                    System.out.println(part);
                }
            }
        }

    }
}
