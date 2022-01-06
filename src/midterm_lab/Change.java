package midterm_lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Change {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter change: ");
    double change = in.nextDouble();

    printModularizedChange(change);
  }

  public static void printModularizedChange(double change) {
    double dollars = Math.floor(change / 100);
    change -= dollars * 100;

    double quarters = Math.floor(change / 25);
    change -= quarters * 25;

    double dimes = Math.floor(change / 10);
    change -= dimes * 10;

    double nickels = Math.floor(change / 5);
    change -= nickels * 5;

    DecimalFormat df = new DecimalFormat("#######.##");

    System.out.println("Your change is: ");
    System.out.println(df.format(dollars) + pluralize(" Dollar", dollars));
    System.out.println(df.format(quarters) + pluralize(" Quarter", quarters));
    System.out.println(df.format(dimes) + pluralize(" Dime", dimes));
    System.out.println(
      df.format(nickels) + pluralize(" Nickel", nickels) + " and");
    System.out.println(df.format(change) + pluralize(" Cent", change));

    int angles = 0;
    {
      switch (angles) {
      case 0:
      case 180: System.out.println("Angle is in X axis"); break;
      case 90:
      case 270: System.out.println("Angle is in Y axis"); break;
      }
    }
  }

  public static String pluralize(String s, Double n) {
    return s + (n > 1 ? "s" : "");
  }
}
