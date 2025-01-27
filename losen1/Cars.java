import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int PRISE_PER_DEY = 200;
        final int SEKIORTI = 50;
        final double PRISE_PER_KM=2.5 ;

        System.out.print("Enter the munt of dey: ");
        int dey = in.nextInt(); 
        System.out.print("Enter the munt of KM: ");
        double km_drive = in.nextDouble();

        double sum=((PRISE_PER_DEY+SEKIORTI)*dey + (PRISE_PER_KM*km_drive));
       
        
        System.out.println("The sum of price is: " + sum);
    }
}
