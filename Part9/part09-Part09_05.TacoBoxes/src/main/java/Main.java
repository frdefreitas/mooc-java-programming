
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        
        TripleTacoBox box1 = new TripleTacoBox();
        CustomTacoBox box2 = new CustomTacoBox(5);
        
        System.out.println(box1.tacosRemaining());
        System.out.println(box2.tacosRemaining());
        box1.eat(); box1.eat(); box2.eat(); box2.eat();
        System.out.println(box1.tacosRemaining() + "\n" + box2.tacosRemaining());
    }
}
