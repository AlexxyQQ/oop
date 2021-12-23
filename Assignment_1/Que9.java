/*Write a Java program to takes the user for a distance (in meters) and the time was taken
 (as three numbers: hours, minutes, seconds), and display the speed, in meters per second,
  kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).ExampleInput distance in meters:
   2500Input hour: 5Input minutes: 56Input seconds: 23Expected Output:Your speed in meters/second is
 0.11691531Your speed in km/h is 0.42089513Your speed in miles/h is 0.26158804 */
package questions;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance in meter: ");
        Double m = sc.nextDouble();
        System.out.print("Enter hours: ");
        Double h = sc.nextDouble();
        System.out.print("Enter minutes: ");
        Double mi = sc.nextDouble();
        System.out.print("Enter seconds: ");
        Double sec = sc.nextDouble();

        double total_sec = sec + mi * 60 + h * 60 * 60;

        System.out.println("Your speed in meters/second is " + (m / total_sec));
        System.out.println("Your speed in km/h is " + (m / total_sec) * 3.6);
        System.out.println("Your speed in miles/h is " + (m / total_sec) * 2.237);

    }
}
