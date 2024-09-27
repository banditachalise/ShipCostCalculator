import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the price?");

        if (in.hasNextDouble()) {
            double price = in.nextDouble();
            double shippingcost;
            if (price >= 100) {
                shippingcost = 0;
            } else {
                shippingcost = price * 0.02;
            }
            double totalcost = shippingcost + price;
            // Output the shipping cost and the total price
            System.out.println("Shipping Cost: $" + shippingcost);
            System.out.println("Total Price: $" + totalcost);
        }
    }
}
