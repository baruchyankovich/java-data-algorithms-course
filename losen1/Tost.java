import java.util.Scanner;

public class Tost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int BASIC_TOST = 12;
        final int CHEAP_ADD_ONS = 2;
        final int EXPENSIVE_ADD_ONS = 3;

        System.out.print("Enter the amount of Tost for the customer: ");
        int numOfTost = scanner.nextInt();

        double priceAbutThisOrder = 0;

        for (int i = 0; i < numOfTost; i++) {
            double priceOfThisTost = BASIC_TOST;
            System.out.print("Enter the amount of add-ons: ");
            int numOfAddOns = scanner.nextInt();

            for (int j = 0; j < numOfAddOns; j++) {
                System.out.print("Add number " + (j + 1) + 
                ". If the add-on is expensive (e.g., yellow cheese) press 1. "
                + "If it's a cheap add-on (e.g., mushrooms, olives, corn) press 2. "
                + "If it's custom, press 3: ");
                int typeOfAddOns = scanner.nextInt();
                scanner.close();

                if (typeOfAddOns == 1) {
                    priceOfThisTost += EXPENSIVE_ADD_ONS;
                } else if (typeOfAddOns == 2) {
                    priceOfThisTost += CHEAP_ADD_ONS;
                } else if (typeOfAddOns == 3) {
                    System.out.print("Enter the price of the special add-on: ");
                    double specialAddOn = scanner.nextDouble();
                    priceOfThisTost += specialAddOn;
                } else {
                    System.out.println("Invalid type, try again.");
                    j--; // Repeat this iteration for invalid input
                }
            }
            priceAbutThisOrder += priceOfThisTost;
        }

        System.out.println("Price of this order is: " + priceAbutThisOrder);
    }
}
