package assignment_5;

import java.util.Scanner;

public class GroundBeefValueCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Price per pound package A:");
    double pricePerPoundA = input.nextDouble();
    System.out.println("Percent lean package A:");
    double percentLeanA = input.nextDouble();

    System.out.println("Enter Price per pound package B:");
    double pricePerPoundB = input.nextDouble();
    System.out.println("Percent lean package B:");
    double percentLeanB = input.nextDouble();

    double costPerPoundOfLeanA = calculateCostPerPound(
      percentLeanA,
      pricePerPoundA
    );
    double costPerPoundOfLeanB = calculateCostPerPound(
      percentLeanB,
      pricePerPoundB
    );
    System.out.printf(
      "Percent A cost per pound of lean: %.4f\n",
      costPerPoundOfLeanA
    );
    System.out.printf(
      "Percent B cost per pound of lean: %.4f\n",
      costPerPoundOfLeanB
    );

    if (costPerPoundOfLeanA < costPerPoundOfLeanB) {
      System.out.println("Package A is the best value.");
    } else {
      System.out.println("Package B is the best value.");
    }
  }

  public static double calculateCostPerPound(
    double leanPercentage, double costPerPound) {
    return (costPerPound / leanPercentage) * 100.0;
  }
}
