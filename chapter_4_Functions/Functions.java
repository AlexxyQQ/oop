package chapter_4_Functions;

import java.util.Scanner;

/**
 * Functions
 */
public class Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a Second number: ");
        int num2 = sc.nextInt();

        int result = add2nums(num, num2);
        System.out.println("The sum is " + result);
    }

    public static int add2nums(int num, int num2) {
        return num + num2;

    }
}