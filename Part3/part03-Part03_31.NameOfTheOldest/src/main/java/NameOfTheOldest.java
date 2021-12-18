
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int oldest = -1;
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String info[] = input.split(",");
  
            int age = Integer.valueOf(info[1]);
            String newname = info[0];
            
            if (age > oldest) {
                oldest = age;
                name = newname;
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
