
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("jamo1"));
        students.add(new Student("jamo"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
