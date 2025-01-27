package losen2;
import java.util.Scanner;

public class NationalIDValidator {
    public static int lenNumber(long num){
        int result = 0; 
        while (num > 0) {
            result++;
            num /= 10;
        }
        return result;
    }

    public static boolean isValid(long id){
        int result = 0;
        int nowNum;
        long lengOfId = lenNumber(id);
        
        
        if (lengOfId > 9 || lengOfId < 8) {
            return false;
        }
        
      
        for (int i = 0; i < lengOfId; i++) {  
            nowNum = (int)(id % 10);
            if (i % 2 == 1) { 
                nowNum = nowNum * 2;
            }
            result = result + (nowNum % 10 + nowNum / 10);  
            id = id / 10;  
        }

        
        return result % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID number: ");
        long id = scanner.nextLong();  
        if (isValid(id)) {
            System.out.println("The ID is valid.");
        } else {
            System.out.println("The ID is invalid.");
        }
        scanner.close();
    }
}
