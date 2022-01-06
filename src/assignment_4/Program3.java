package assignment_4;

import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose type of taxi: ");
    System.out.println("1. Micro = Php15.00/km");
    System.out.println("2. Macro = Php35.50/km");
    System.out.println("3. Shared = Php8.50/km");
    System.out.print("Input choice: ");

    int taxiType = sc.nextInt();
    System.out.print("Input distance in kilometers: ");
    double distance = sc.nextDouble();

    double totalFare = 0.0;
    try { totalFare = calculateFare(distance, taxiType); } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Your total fare is: " + totalFare);
  }

  public static double calculateFare(double distance, int taxiType)
  throws Exception {
    final double fareRate;

    if (taxiType == 1) {
      fareRate = 15;
    } else if (taxiType == 2) {
      fareRate = 35.5;
    } else if (taxiType == 3) {
      fareRate = 8.5;
    } else { throw new Exception("Invalid taxi type"); }

    return distance * fareRate;
  }
}

