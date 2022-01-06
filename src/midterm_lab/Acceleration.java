package midterm_lab;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Acceleration {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(isr);
    System.out.print("Enter distance in meters: ");
    double distance = Double.parseDouble(bf.readLine());
    System.out.print("Enter the no. hours: ");
    double hours = Double.parseDouble(bf.readLine());
    System.out.print("Enter the no. minutes: ");
    double minutes = Double.parseDouble(bf.readLine());
    System.out.print("Enter the no. seconds: ");
    double seconds = Double.parseDouble(bf.readLine());
    printSpeed(distance, hours, minutes, seconds);
  }

  public static void printSpeed(
    double distanceInMeters, double hours, double minutes, double seconds) {
    DecimalFormat df = new DecimalFormat("##########.##");
    System.out.println("*********************************************");
    System.out.println("Distance: " + df.format(distanceInMeters));
    System.out.println("Hours: " + df.format(hours));
    System.out.println("Minutes: " + df.format(minutes));
    System.out.println("Seconds: " + df.format(seconds) + "\n");

    System.out.println(
      "Your speed in meters/second is "
      + df.format(distanceInMeters / toSeconds(hours, minutes, seconds)));

    System.out.println(
      "Your speed in km/h is "
      + df.format(
        (distanceInMeters / 1000) / toHours(hours, minutes, seconds)));

    System.out.println(
      "Your speed in miles/h is "
      + df.format(
        (distanceInMeters / 1609) / toHours(hours, minutes, seconds)));

    System.out.println("*********************************************");
  }

  public static double toSeconds(double hours, double minutes, double seconds) {
    return (hours * 3600) + (minutes * 60) + seconds;
  }

  public static double toHours(double hours, double minutes, double seconds) {
    return hours + (minutes / 60) + (seconds / 3600);
  }
}
