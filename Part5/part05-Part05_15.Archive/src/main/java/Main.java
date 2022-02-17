
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String Id = scanner.nextLine();
            if (Id.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Archive item = new Archive(Id, name);
            
            if (!(archive.contains(item))) {
                archive.add(item);
            }
            
            
        }
        
        System.out.println("==Items==");
        for (int i = 0; i < archive.size(); i++) {
            System.out.println(archive.get(i).getId() + ": " + archive.get(i).getName());
            
        }
    }
}
