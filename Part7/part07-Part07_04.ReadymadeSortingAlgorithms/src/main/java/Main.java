
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(3); integers.add(1); integers.add(5); integers.add(99); integers.add(3); integers.add(12);
        System.out.println(integers);
        sortIntegers(integers);
        System.out.println(integers);
        
        
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
