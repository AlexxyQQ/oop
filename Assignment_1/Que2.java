//Write a Java program that checks whether a given string is a palindrome or not. Ex: MADAM is a palindrome.
package questions;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String user_input = sc.next();
        String reversed = "";
        for (int i = user_input.length() - 1; i >= 0; i--) {
            reversed = reversed + user_input.charAt(i);

        }
        if (user_input.equals(reversed)) {
            System.out.println(user_input + " is a palindrome.");
        } else {
            System.out.println(user_input + " is not a palindrome.");

        }
    }
}
