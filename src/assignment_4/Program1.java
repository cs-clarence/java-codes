package assignment_4;

import java.util.Scanner;

public class Program1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PREFERRED CONVERSION");
    System.out.println("1. kpl to mpg");
    System.out.println("2. mpg to kpl");
    System.out.println();
    System.out.print("Enter your choice: ");
    int option = sc.nextInt();

    switch (option) {
      case 1: {
        System.out.print("Enter kilometers per liter value: ");
        double val = sc.nextDouble();

        System.out.printf(
          "The equivalent miles per gallon is: %.2f",
          kplToMpg(val)
        );
      }
      break;
      case 2: {
        System.out.print("Enter miles per gallon value: ");
        double val = sc.nextDouble();

        System.out.printf(
          "The equivalent kilometers per liter is: %.2f",
          mpgToKpl(val)
        );
      }
      break;
      default:
        System.out.println("Invalid input");
    }
  }

  public static double kplToMpg(double kpl) {
    return (kpl / 1.609) * 3.785;
  }

  public static double mpgToKpl(double mpg) {
    return (mpg * 1.609) / 3.785;
  }
}
