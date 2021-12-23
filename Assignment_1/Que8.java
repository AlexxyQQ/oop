/*Write a Java program to compute body massindex (BMI).Note: 
The formula is BMI = kg/m2 where kg is a person's weight in kilograms and m2is their height in metres squared. */
package questions;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in KG: ");
        double kg = sc.nextDouble();
        System.out.println("Enter your height in meters: ");
        double m = sc.nextDouble();

        System.out.println("Your BMI is " + (kg / (m * m)));
    }
}
