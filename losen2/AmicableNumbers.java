package losen2;

public class AmicableNumbers {

    public static void main(String[] args) {
        int count = 0;
        int limit = 100000;

        System.out.println("The first 10 pairs of amicable numbers are:");

        for (int num1 = 2; num1 < limit && count < 10; num1++) {
            int num2 = sumOfDivisors(num1);
            if (num1 < num2 && sumOfDivisors(num2) == num1) {
                System.out.println("(" + num1 + ", " + num2 + ")");
                count++;
            }
        }
    }
    
    public static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }

    
}

