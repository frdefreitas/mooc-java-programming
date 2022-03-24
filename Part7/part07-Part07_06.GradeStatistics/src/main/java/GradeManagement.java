
/**
 *
 * @author frdefreitas
 */
import java.util.ArrayList;

public class GradeManagement {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    private int participants;
    
    public GradeManagement() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.participants = 0;
    }
    
    public void add(int grade) {
        
        if (grade >= 0 && grade <= 100) {
            this.points.add(grade);
            this.participants++;
            
            if (grade >= 50) {
                this.passingGrades.add(grade);
            }
            this.grades.add(pointToGrade(grade));
        }
    }
    
    public double average(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        return (sum * 1.0) / grades.size();
    }
    
    public void print() {
        if (this.passingGrades.isEmpty()) {
            System.out.println("Point average (all): " + this.average(points));
            System.out.println("/n Point average (passing): -");
            System.out.println("Pass percentage: " + (double)(100 * this.passingGrades.size()) / this.participants);
        } else {
            System.out.println("Point average (all): " + this.average(points));
            System.out.println("Point average (passing): " + this.average(passingGrades));
            System.out.println("Pass percentage: " + (double)(100 * this.passingGrades.size()) / this.participants);
                    
        }
    }  
    
    public void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i +": ");
            for (int grade: grades) {
                if (grade == i) {
                    this.printStar();
                }
            }
            System.out.println("");
        } 
    
    }
    
    public void printStar() {
        System.out.print("*");
    }
    
    public static int pointToGrade(int points) {
        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
}
