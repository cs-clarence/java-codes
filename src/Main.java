import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double cms = 0.0;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input length in cm: ");
    cms = scanner.nextDouble();

    double inches = cmToInches(cms);
    double yards = inchesToYards(inches);
    double feet = inchesToFeet(inches);

    System.out.printf("%f cm x 1 inch / 2.54cm =  %.2f \n", cms, inches);
    System.out.printf(
      "%.2f yards, %.2f feet (foot), and %.2f inch (es)",
      yards,
      feet,
      inches
    );
  }

  public static double cmToInches(double cms) { return cms * 1 / 2.54; }

  public static double inchesToYards(double inches) {
    return inches * 0.0277777778;
  }

  public static double inchesToFeet(double inches) { return inches / 12; }
}
