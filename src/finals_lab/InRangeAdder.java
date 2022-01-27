package finals_lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InRangeAdder {
  public static void main(String[] args) {
    List<Double> numbers = new ArrayList<Double>();

    Scanner scanner = new Scanner(System.in);
    System.out.println("In Range Adder");
    System.out.println("Low end of range: ");
    double lowEndRange = scanner.nextDouble();
    System.out.println("High end of range: ");
    double highEndRange = scanner.nextDouble();
    System.out.println();

    double input = 0;
    do {
      System.out.println("Enter data: ");
      input = scanner.nextDouble();
      numbers.add(input);
    } while (input != 0);

    double inRangeSum = 0;
    double outOfRangeSum = 0;
    for (int i = 0; i < numbers.size(); ++i) {
      double currentNumber = numbers.get(i);
      if (currentNumber >= lowEndRange && currentNumber <= highEndRange) {
        inRangeSum += currentNumber;
      } else {
        outOfRangeSum += currentNumber;
      }
    }

    DecimalFormat df = new DecimalFormat(".#");

    System.out.println("Sum of in range values: " + df.format(inRangeSum));
    System.out.println("Sum of out of range values: "
                       + df.format(outOfRangeSum));
  }
}
