//Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
package questions;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        String numbers = sc.next();
        String all_numbers = "";
        int sum_numbers = 0;
        for (int i = 0; i < numbers.length(); i++) {
            all_numbers = all_numbers + numbers.charAt(i) + " ";
            sum_numbers = sum_numbers + Character.getNumericValue(numbers.charAt(i));

        }
        System.out.println("Your seperate integers are: " + all_numbers);
        System.out.println("Sum of all your integer is: " + sum_numbers);
    }
}
