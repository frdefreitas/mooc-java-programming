
/**
 *
 * @author frdefreitas
 */
import java.util.Scanner;

public class UserInterface {
    private GradeManagement grades;
    private Scanner scanner;
    
    public UserInterface(GradeManagement grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            } else {
                grades.add(Integer.valueOf(input));
            }
        }
        grades.print();
        grades.gradeDistribution();
    }
}
