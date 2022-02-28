/**
 *
 * @author frdefreitas
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands: ");
            System.out.println("1: add a joke");
            System.out.println("2: draw a joke");
            System.out.println("3: list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            
            if (input.equals("X")) {
                break;
            }
            commands(input);
            
        }

    }
    public void commands(String cmd) {
            if (cmd.equals("1")) {
                add();
            } else if (cmd.equals("2")) {
                draw();
            } else if (cmd.equals("3")) {
                list();
            }
        }
    
    public void add() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokes.addJoke(joke);
    }
    public void draw() {
        System.out.println(this.jokes.drawJoke());
    }
    public void list() {
        this.jokes.printJokes();
    }
}
