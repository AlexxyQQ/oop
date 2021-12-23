//Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
package questions;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int number_of_factors = 0;
        int i = 2;

        System.out.print("Enter your number: ");
        num = sc.nextInt();
        for (i = 2; i <= num; i++) {
            number_of_factors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    number_of_factors++;
                }
            }

            if (number_of_factors <= 2) {
                System.out.print(i + ", ");
            }

        }

    }
}
