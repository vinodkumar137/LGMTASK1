import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rates
        double usdToEur = 0.85;
        double usdToGbp = 0.73;
        double usdToJpy = 110.15;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
        
        // Convert to other currencies
        double eurAmount = usdAmount * usdToEur;
        double gbpAmount = usdAmount * usdToGbp;
        double jpyAmount = usdAmount * usdToJpy;
        
        // Print the results
        System.out.println("Amount in EUR: " + eurAmount);
        System.out.println("Amount in GBP: " + gbpAmount);
        System.out.println("Amount in JPY: " + jpyAmount);
        
        scanner.close();
    }
}
