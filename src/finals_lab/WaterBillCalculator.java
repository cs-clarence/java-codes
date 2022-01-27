package finals_lab;

import java.util.Scanner;

public class WaterBillCalculator {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter account number: ");
    int accountNumber = scanner.nextInt();
    scanner.nextLine();
    System.out.print(
      "Enter code for type of usage (H = home, C = commercial, or I = industrial): ");
    char usageCode = scanner.nextLine().charAt(0);
    System.out.print("Enter the amount of gallons of water used: ");
    double gallons = scanner.nextDouble();

    String usage = "";
    double amountDue = 0;
    switch (usageCode) {
      case 'H':
        usage = "Home";
        amountDue = 5.00 + (0.005 * gallons);
        break;
      case 'C':
        usage = "Commercial";
        amountDue = 1000.0;
        if (gallons > 4000000.0) {
          amountDue += (gallons - 4000000.0) * 0.025;
        }
        break;
      case 'I':
        usage = "Industrial";
        if (gallons <= 4000000.0) {
          amountDue = 1000.0;
        } else if (gallons > 4000000.0 && gallons <= 10000000.0) {
          amountDue = 2000.0;
        } else {
          amountDue = 3000.0;
        }
        break;
      default:
        System.out.println("Invalid code for type of usage");
        return;
    }
    System.out.println("===================================================");
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Usage: " + usageCode + " (" + usage + ")");
    System.out.println("Amount Due: PHP " + amountDue);
    System.out.println("===================================================");
  }
}