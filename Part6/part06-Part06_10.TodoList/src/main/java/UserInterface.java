
/**
 *
 * @author frdefreitas
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            }
            
            commands(cmd);
            
        }
    }
    
    public void commands(String cmd) {
        if (cmd.equals("add")) {
            add();
        } else if (cmd.equals("list")) {
            list();
        } else if (cmd.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.println("To add: ");
        String cmd = scanner.nextLine();
        this.list.add(cmd);
    }
    
    public void list() {
        this.list.print();
    }
    
    public void remove() {
        System.out.println("Which one is removed: ");
        int num = Integer.valueOf(scanner.nextLine());
        this.list.remove(num);
    }
}
