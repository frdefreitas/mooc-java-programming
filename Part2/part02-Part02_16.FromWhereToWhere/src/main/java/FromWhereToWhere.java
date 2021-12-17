
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int numberTo = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int numberFrom = Integer.valueOf(scanner.nextLine());
    // Write your program here
        for (int i = numberFrom; i <= numberTo; i++) {
            if (numberTo < numberFrom){
                break;
            }
            System.out.println(i);
        }
    }
}
