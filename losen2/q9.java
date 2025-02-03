package losen2;
import java.util.Scanner;

public class q9 {

    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        int num1 ,num2;
        System.out.println("Enter 2 numbers with the same number if digits ");
        System.out.println("Enter the first number: ");
        num1=scanner.nextInt();
        System.out.println("Enter the secend number: ");
        num2=scanner.nextInt();
        System.out.println("the marge of : "+num1+" and: "+ num2 +" is " + buildNewNumber (num1,num2));
        scanner.close();

    

    }
    public static int buildNewNumber(int num1, int num2) {
        int result = 0;
        int multiplier = 1;

        while (num1 > 0 && num2 > 0) {
            int digit1 = num1 % 10; 
            int digit2 = num2 % 10; 

            for (int i = 0; i < digit1; i++) {
                result += digit2 * multiplier;
                multiplier *= 10;

                if (multiplier > 1_000_000_000) {
                    System.out.println("The result exceeds 9 digits, truncating.");
                    return result;
                }
            }

            num1 /= 10;
            num2 /= 10;
        }

        return result;
    }
}


