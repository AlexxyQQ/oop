/*Write a Java program that accepts two floating-point numbers and 
checks whether they are the same up to two decimal places. */
package questions;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first decimal number.");
        String number1 = sc.next();
        System.out.print("Enter second decimal number.");
        String number2 = sc.next();

        // variabls
        String after_decimal1 = "";
        String after_decimal1_2 = "";
        boolean add1 = false, add2 = false;
        String after_decimal2 = "";
        String after_decimal2_2 = "";

        for (int i = 0; i <= number1.length() - 1; i++) {

            if (number1.charAt(i) == '.') {
                add1 = true;
            }

            if (add1) {
                after_decimal1 = after_decimal1 + number1.charAt(i);

            }

        }
        for (int j = 1; j < 3; j++) {
            after_decimal1_2 = after_decimal1_2 + after_decimal1.charAt(j);
        }

        for (int a = 0; a <= number2.length() - 1; a++) {

            if (number2.charAt(a) == '.') {
                add2 = true;
            }

            if (add2) {
                after_decimal2 = after_decimal2 + number2.charAt(a);

            }

        }
        for (int b = 1; b < 3; b++) {
            after_decimal2_2 = after_decimal2_2 + after_decimal2.charAt(b);
        }

        if (after_decimal1_2.equals(after_decimal2_2)) {
            System.out.println("They are same up 2 decimal");
        } else {
            System.out.println("They are not same");
        }
    }

}
