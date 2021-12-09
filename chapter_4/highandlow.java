package chapter_4;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class highandlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int resulth = highest(num1, num2, num3);
        if (resulth != 0) {
            System.out.println("Highest " + resulth);
        } else {
            System.out.println("You probably entered same numbers.");
        }

        int resultl = lowest(num1, num2, num3);
        if (resultl != 0) {
            System.out.println("Lowest " + resultl);
        }
    }

    public static int highest(int num1, int num2, int num3) {

        if (num1 > num2 & num1 > num3) {
            return num1;
        }
        if (num2 > num1 & num2 > num3) {
            return num2;
        }
        if (num3 > num2 & num3 > num1) {
            return num3;
        } else {
            return 0;
        }

    }

    public static int lowest(int num1, int num2, int num3) {

        if (num1 < num2 & num1 < num3) {
            return num1;
        }
        if (num2 < num1 & num2 < num3) {
            return num2;
        }
        if (num3 < num2 & num3 < num1) {
            return num3;
        } else {
            return 0;
        }

    }
}
