package assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {

  public static void main(String[] args) throws IOException {
    double cms = 0.0;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);

    System.out.print("Input length in cm: ");
    cms = Double.parseDouble(bf.readLine());

    double inches = cmToInches(cms);
    double yards = inchesToYards(inches);
    double feet = inchesToFeet(inches);

    System.out.printf("%.2f cm x 1 inch / 2.54cm =  %.2f \n", cms, inches);
    System.out.printf(
      "%.2f yards, %.2f feet (foot), and %.2f inch (es)",
      yards,
      feet,
      inches
    );
  }

  public static double cmToInches(double cms) { return cms * 1 / 2.54; }

  public static double inchesToYards(double inches) {
    return inches / 36;
  }

  public static double inchesToFeet(double inches) { return inches / 12; }
}
