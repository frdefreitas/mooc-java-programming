
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        
        Timer time = new Timer();
        
        while (true) {
            System.out.println("timer");
            time.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
               
            }
        }

    }
}
