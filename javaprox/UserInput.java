package javaprox;

import java.util.Scanner;

class AreaOfRect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of rectangle: ");
        // Input
        int Length = sc.nextInt();
        System.out.print("Enter the Breadth of rectangle: ");
        int Breadth = sc.nextInt();
        // Algorithm
        int Result = Length * Breadth;
        // Output
        System.out.print("The Area Of Rectangle is " + Result);
        int sqrt = (int) Math.sqrt(Result);

        if (sqrt * sqrt == Result) {
            System.out.print("Is Sqrt");
        } else {
            System.out.print("Isnt Sqrt");
        }

    }
}