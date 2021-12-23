/* Write a Java program that accepts three numbers from the user and prints "increasing" 
if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, 
and "Neither increasing or decreasing order" otherwise. */
package Assignment_1;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 == number2 & number2 == number3) {
            System.out.println("All numbers are equall");
        }
        if (number1 > number2 & number2 > number3) {
            System.out.println("increasing");
        }
        if (number1 < number2 & number2 < number3) {
            System.out.println("decreasing");

        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
