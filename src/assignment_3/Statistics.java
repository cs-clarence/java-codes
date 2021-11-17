package assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistics {
  public static void main(String[] args) throws IOException {
    double[] values = new double[3];

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);

    for (int i = 0; i < values.length; ++i) {
      System.out.print("Student Grade No. " + (i + 1) + ": ");
      values[i] = Double.parseDouble(bf.readLine());
    }

    double max = maximum(values);
    double min = minimum(values);
    double ave = average(values);

    System.out.printf("The average of %s is: %.2f\n", separate(values), ave);
    System.out.printf("The minimum of %s is: %.2f\n", separate(values), min);
    System.out.printf("The maximum of %s is: %.2f\n", separate(values), max);
  }

  public static String separate(double[] values) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < values.length; ++i) {
      if (i == values.length - 1) { sb.append("and "); }
      sb.append(values[i]);
      if (i < values.length - 1) { sb.append(", "); }
    }
    return sb.toString();
  }

  public static double maximum(double[] values) {
    double max = values[0];
    for (int i = 0; i < values.length; ++i) {
      if (max < values[i]) { max = values[i]; }
    }
    return max;
  }

  public static double minimum(double[] values) {
    double min = values[0];
    for (int i = 0; i < values.length; ++i) {
      if (min > values[i]) { min = values[i]; }
    }
    return min;
  }

  public static double average(double[] values) {
    double ave = 0;
    for (int i = 0; i < values.length; ++i) ave += values[i];
    return ave / values.length;
  }
}
