package losen3;

public class q12 {
    public static long[] addToLong(long num1 ,long num2){
        long[]big,smal;
        
        if (num1>num2){
            big=num1;
            smal=num2;
        }
        else if(num1<num2){
            big=num2;
            smal=num1;}
        else{

            return intToArr(num1*2);
        }


    }
    public static long[] intToArr(long number) {
        int length = lenNumber(number);
        long[] result = new long[length];
        int i = 0;
    
        while (number > 0) {
            result[length - 1 - i] = number - (number / 10) * 10;; 
             number /= 10;
            i++; 
        }
    
        return result;
    }
    

    public static int lenNumber(long num) {
        int result = 0;
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }
}
