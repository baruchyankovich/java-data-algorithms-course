package losen3;
import java.util.Scanner;

public class q11 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = in.nextInt();
        in.close();

        int[] arrOfNumbers = transToArr(userInput);
        printer(arrOfNumbers);
    }

    public static int lenNumber(int num) {
        int result = 0;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }

    public static int[] transToArr(int number) {
        int length = lenNumber(number);
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[i] = number % 10;
            number /= 10;
        }

        return result;
    }

    public static int theMax(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        return result;
    }

    public static void printer(int[] numbers) {
        int max = theMax(numbers);

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
