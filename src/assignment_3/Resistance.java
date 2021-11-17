package assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Resistance {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    System.out.print("Enter V in volts: ");
    double v = Double.parseDouble(bf.readLine());

    System.out.print("Enter I in amperes: ");
    double i = Double.parseDouble(bf.readLine());

    DecimalFormat df = new DecimalFormat("##,###,##0.00");

    System.out.println("Resistance R is: "
                       + df.format(resistance(v, i))
                       + " ohms");
  }

  public static double resistance(double voltage, double ampere) {
    return voltage / ampere;
  }
}
