package chapter_4_Functions;

import java.util.Scanner;

public class Simpleintrestfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double result = simpleintrest(p, t, r);
        System.out.println("Simple intrest is " + result);
    }

    public static double simpleintrest(double p, double t, double r) {
        return (p * t * r) / 100;

    }
}
