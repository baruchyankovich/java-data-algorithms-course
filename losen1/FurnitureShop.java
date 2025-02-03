import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the price of the furniture (in ₪): ");
        double furniturePrice = scanner.nextDouble();

        System.out.print("Enter the weight of the furniture (in kg): ");
        double furnitureWeight = scanner.nextDouble();

        System.out.print("Enter the floor number of the delivery destination: ");
        int floorNumber = scanner.nextInt();

        System.out.print("Enter the distance of delivery (in km): ");
        double deliveryDistance = scanner.nextDouble();
        scanner.close();
       
        double deliveryCost = deliveryDistance * 5; 
        double weightCost = furnitureWeight * floorNumber; 
        double tip = furniturePrice * 0.1; 

        
        double totalCost = furniturePrice + deliveryCost + weightCost + tip;

        
        System.out.println("The total cost of the purchase is: " + totalCost + " ₪");
    }
}
