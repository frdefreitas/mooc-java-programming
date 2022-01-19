
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter count0 = new Counter();
        Counter count1 = new Counter(1);
        
        count0.increase();
        count1.decrease();
        System.out.println(count0);
        System.out.println(count1);
        
        count0.increase(9);
        count0.decrease(5);
        count1.increase(10);
        count1.decrease(5);
        count0.increase(-5);
        count0.decrease(-5);
        count1.increase(-5);
        count1.decrease(-5);
        System.out.println(count0);
        System.out.println(count1);
        
    }
}
