
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
        //System.out.println("Index of smallest number: " + MainProgram.indexOfSmallest(array));
    }
    
    public static int smallest(int[] array) {
       int smallest = array[0];
       
       for (int i = 1; i < array.length; i++) {
           if (array[i] < smallest) {
               smallest = array[i];
           } 
       }
       return smallest;
    }       
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i; 
            }   
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int swap = array[index1];
        
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length; i++) {
            int smallestNow = array[MainProgram.indexOfSmallestFrom(array, i)];
            
            if (array[i] > smallestNow) {
                int indexSmallest = MainProgram.indexOfSmallestFrom(array, i);
                MainProgram.swap(array, indexSmallest, i);
                System.out.println(Arrays.toString(array));
            }
            
        }
    }
}
