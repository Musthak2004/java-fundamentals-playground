import java.util.Scanner;
import java.text.NumberFormat; // Added for currency formatting

public class Mortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($): ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double annualInterest = scanner.nextDouble();
        // Convert annual percentage to monthly decimal
        double monthlyInterest = (annualInterest / 100) / 12;

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        // Convert years to total number of months
        int numberOfPayments = years * 12;

        // The Formula: M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Formatting the output as currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Monthly Mortgage: " + mortgageFormatted);
    }
}