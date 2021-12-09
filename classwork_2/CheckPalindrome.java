package classwork_2;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        char ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number to check whether it's palindrome or not:");
            int number = sc.nextInt();

            int remainder = number % 10;
            int quotient = number / 10;
            int result = remainder * 10 + quotient;

            if (result == number) {
                System.out.print(number + " is a palindrome.");
            } else {
                System.out.print(number + " is not a palindrome.");
            }
            System.out.println("Do you wanna continue");
            ch = sc.next().toLowerCase().charAt(0);
        } while (ch == 'y');
    }

}