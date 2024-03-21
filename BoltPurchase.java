import java.util.Scanner;

public class BoltPurchase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int BOLT_PRICE = 5; 
        final int NUT_PRICE = 3; 
        final int WASHER_PRICE = 1; 

        System.out.print("Number of bolts: ");
        int bolts = scanner.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = scanner.nextInt();
        System.out.print("Number of washers: ");
        int washers = scanner.nextInt();
        int totalCost = bolts * BOLT_PRICE + nuts * NUT_PRICE + washers * WASHER_PRICE;


        boolean hasError = false;
        if (nuts < bolts) {
            System.out.println("Check the Order: too few nuts");
            hasError = true;
        }
        if (washers < 2 * bolts) {
            System.out.println("Check the Order: too few washers");
            hasError = true;
        }
        if (!hasError) {
            System.out.println("Order is OK.");
        }

        System.out.println("\nTotal cost: " + totalCost + " cents");
    }
}
