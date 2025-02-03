package losen3;

import java.util.Scanner;
import java.util.Arrays;

public class q12 {
    public static void main(String[] args){
        long num1, num2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = in.nextLong();
        System.out.print("Enter a number: ");
        num2 = in.nextLong();
        in.close(); 
       
        int[] result = addToLong(num1, num2);
        System.out.println(Arrays.toString(result));  
    }

    public static int[] addToLong(long num1, long num2) {
        int[] biggerNumber, smallerNumber;

        if (num1 > num2) {
            biggerNumber = intToArr(num1);
            smallerNumber = intToArr(num2);
        } else if (num1 < num2) {
            biggerNumber = intToArr(num2);
            smallerNumber = intToArr(num1);
        } else {
            return intToArr(num1 + num2); 
         }

        return addArrToArr(biggerNumber, smallerNumber);
    }

    public static int[] intToArr(long number) {
        if (number == 0) return new int[]{0};
        int length = lenNumber(number);
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[i] = (int) (number % 10);
            number /= 10;
        }

        return result;
    }

    public static int lenNumber(long num) {
        if (num == 0) return 1; 
        int result = 0;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }

    public static int[] addArrToArr(int[] biggerNumber, int[] smallerNumber) {
        int maxLength = biggerNumber.length;
        int[] result = new int[maxLength + 1]; 
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int bigIndex = maxLength - 1 - i;
            int smallIndex = smallerNumber.length - 1 - i;

            int smallDigit = (smallIndex >= 0) ? smallerNumber[smallIndex] : 0; 
            int sum = biggerNumber[bigIndex] + smallDigit + carry;

            result[bigIndex + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry; 

        return (result[0] == 0) ? Arrays.copyOfRange(result, 1, result.length) : result; // הסרת 0 מוביל אם אין צורך
    }
}
