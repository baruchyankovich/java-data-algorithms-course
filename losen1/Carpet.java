import java.util.Scanner;
public class Carpet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for (int i = 0; i < n * n; i++) { 
            for (int j = 0; j < n * n; j++) { 
                if ((i / n + j / n) % 2 == 0) { 
                    System.out.print("#"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
        }
        scanner.close();

    }}