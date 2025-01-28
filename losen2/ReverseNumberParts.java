package losen2;
import java.util.Scanner;

public class ReverseNumberParts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int number = scanner.nextInt();
        System.out.println("Enter a digit (length of each part):");
        int partLength = scanner.nextInt();

        
        if (partLength <= 0) {
            System.out.println("The length of each part must be greater than 0.");
            return;
        }

       
        int result = reverseParts(number, partLength);

        
        System.out.println("Result: " + result);
    }

    public static int reverseParts(int number, int partLength) {
        int result = 0;  
        int multiplier = 1; 

        
        while (number > 0) {
            int currentPart = 0; 
            int power = 1; 

            
            for (int i = 0; i < partLength && number > 0; i++) {
                currentPart = currentPart * 10 + (number % 10);
                number /= 10;
                power *= 10;
            }

            
            while (currentPart > 0) {
                result += (currentPart % 10) * multiplier;
                currentPart /= 10;
                multiplier *= 10;
            }
        }

        return result;
    }
}
