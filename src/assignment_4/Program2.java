package assignment_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("######.##");
    System.out.print("Enter year: ");
    double year = sc.nextDouble();

    if (isLeapYear(year)) {
      System.out.println("The year "
                         + df.format(year)
                         + " is a leap year.");
    } else {
      System.out.println("The year "
                         + df.format(year)
                         + " is NOT a leap year.");
    }
  }

  public static boolean isLeapYear(double year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }
}
