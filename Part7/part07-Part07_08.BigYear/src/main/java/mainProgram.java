
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        
        while (true) {
        System.out.println("?");
        String input = scan.nextLine();
        
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }
            
            if (input.equals("Observation")) {
                System.out.println("Bird?");
                String obsBird = scan.nextLine();
                boolean status = false;
                for (Bird bird: birds) {
                    if (bird.containName(obsBird)) {
                        bird.addObservation();
                        status = true;
                    }
                }
                if (status == false) {
                    System.out.println("Not a bird!");
                }
            }
            
            if (input.equals("One")) {
                System.out.println("Bird?");
                String searched = scan.nextLine();
                for (Bird bird: birds) {
                    if (bird.getName().equals(searched)) {
                        System.out.println(bird);
                    }
                }
            }
            
            if (input.equals("All")) {
                for (Bird bird: birds) {
                    System.out.println(bird);
                }
            }
        }
        
    }

}
