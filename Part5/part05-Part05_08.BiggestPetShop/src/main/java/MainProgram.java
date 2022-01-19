
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        Person lilo = new Person();

        System.out.println(leo);
        System.out.println(lilo);
    }
}
