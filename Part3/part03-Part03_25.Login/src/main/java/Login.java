
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String pwd = scanner.nextLine();
        
        checkUser(username, pwd);
        }
    
    public static void checkUser(String username, String pwd) {
        
        if (username.equals("alex") && pwd.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
            return;
        }
        if (username.equals("emma") && pwd.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorret username or password!");
        }
    }
}
