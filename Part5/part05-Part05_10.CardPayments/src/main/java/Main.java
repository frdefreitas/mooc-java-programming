
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);
        
        PaymentCard annesCard = new PaymentCard(2);
        
        System.out.println("Amount of money on the card is: " + annesCard.balance() + " euros");
         
        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
       
        unicafeExactum.addMoneyToCard(annesCard, 100);
        
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        
        System.out.println("Amount of money on the card is: " + annesCard.balance() + " euros");
        
        System.out.println(unicafeExactum);
        
    }
}

        //double change = unicafeExactum.eatAffordably(10);
        //System.out.println("remaining change: " + change);

