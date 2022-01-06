package playground;

import java.io.DataInputStream;

public class Test {
  public static void main(String[] args) throws Exception {
    DataInputStream dis = new DataInputStream(System.in);

    System.out.print("Enter amount of purchases: ");

    int amount = dis.readInt();

    if (amount < 500) {
      System.out.println(amount);
    } else {
      System.out.println(amount - (amount * .10));
    }
  }
}
