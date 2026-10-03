import java.util.Scanner;

public class waterbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();
        
        int billAmount;

        
        if (consumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }

        
        System.out.println("Your total water bill is: Rs. " + billAmount);
        
        scanner.close();
    }
}
