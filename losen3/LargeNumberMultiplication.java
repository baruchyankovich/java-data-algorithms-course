package losen3;

public class LargeNumberMultiplication {
    public static int[] multiplyNumbers(int[] num1, int[] num2) {
        int len1 = num1.length;
        int len2 = num2.length;
        int[] result = new int[len1 + len2];

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                result[i + j] += num1[i] * num2[j];
                result[i + j + 1] += result[i + j] / 10;
                result[i + j] %= 10;
            }
        }

        int newSize = result.length;
        while (newSize > 1 && result[newSize - 1] == 0) {
            newSize--;
        }
        
        int[] finalResult = new int[newSize];
        System.arraycopy(result, 0, finalResult, 0, newSize);
        return finalResult;
    }

    public static void main(String[] args) {
        int[] num1 = {4, 3, 2, 1}; 
        int[] num2 = {7, 9};       
        
        int[] result = multiplyNumbers(num1, num2);
        
        
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.print(result[i] + " ");
        }
    }
}

