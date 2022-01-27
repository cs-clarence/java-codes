package finals_lab;

import java.util.Scanner;

public class CountFamilies {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many family members do you have? ");
    int numberOfFamilies = scanner.nextInt();
    double[] incomes = new double[numberOfFamilies];

    System.out.println();
    for (int i = 0; i < incomes.length; i++) {
      System.out.print("Please enter income of family member "
                       + (i + 1)
                       + ": ");
      incomes[i] = scanner.nextDouble();
    }
    System.out.println();

    for (int i = 0; i < incomes.length; i++) {
      System.out.println("Income Family Member #"
                         + (i + 1)
                         + " is: "
                         + incomes[i]);
    }

    System.out.println();
    double max = max(incomes);
    System.out.println("Maximum Income: " + max);
    double min = min(incomes);
    System.out.println("Minimum Income: " + min);

    System.out.println();
    System.out.println();
    double maxIncome10thPercentile = max * .10;
    System.out.println("10 Percent of Maximum Income is: "
                       + maxIncome10thPercentile);

    int below10thPercentile = 0;
    for (int i = 0; i < incomes.length; i++) {
      if (incomes[i] < maxIncome10thPercentile) {
        ++below10thPercentile;
      }
    }

    System.out.println(
      "Number of Family Members whose income is below 10 percent: "
      + below10thPercentile);
  }

  public static double min(double[] numbers) {
    double minimum = numbers[0];

    for (int i = 0; i < numbers.length; ++i) {
      double currentNumber = numbers[i];
      if (currentNumber < minimum) {
        minimum = currentNumber;
      }
    }

    return minimum;
  }

  public static double max(double[] numbers) {
    double maximum = numbers[0];

    for (int i = 0; i < numbers.length; ++i) {
      double currentNumber = numbers[i];
      if (currentNumber > maximum) {
        maximum = currentNumber;
      }
    }

    return maximum;
  }
}