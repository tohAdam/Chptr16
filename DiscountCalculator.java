import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int DISCOUNT_THRESHOLD = 1000; 
        final double DISCOUNT_RATE = 0.10; 

        System.out.print("Enter amount of purchases (in cents): ");
        int purchaseAmount = scan.nextInt();
        int discountedPrice;
       
      if (purchaseAmount > DISCOUNT_THRESHOLD) {
            double discountAmount = purchaseAmount * DISCOUNT_RATE;
            discountedPrice = (int) (purchaseAmount - discountAmount);
        } else 
            discountedPrice = purchaseAmount;
        System.out.println("Discounted price: " + discountedPrice + " cents");
    }
}
