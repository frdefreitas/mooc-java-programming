
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            String title = input;
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine().trim());
            books.add(new Book(title, age));
            System.out.println("");
            
        }
        Comparator<Book> comparator = Comparator.comparing(Book::getAgeRecomendation)
                .thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        
        printBooks(books);
        
    }
    
    public static void printBooks(ArrayList<Book> books) {
        System.out.println(books.size() + " books in total.\n\nBooks:\n");
        for (Book book: books) {
            System.out.println(book);
        }
    }

}
