package javaprox;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle:");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of rectangle:");
        int breadth = sc.nextInt();

        // Algorithm
        float result = (length * breadth);

        // output
        System.out.print("the area of rectangle is " + result);

        int sqrt = (int) Math.sqrt(result);

        if (sqrt * sqrt == result) {
            System.out.print(result + "is perfect square");
        } else {
            System.out.print(result + " is not a perfect square");
        }

    }
}