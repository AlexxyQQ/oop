/*Write a java program to check weather a given number is Armstrong number or not.*/
package Assignment_1;

import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        String num = sc.next();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int val = Character.getNumericValue(num.charAt(i));
            sum = sum + (val * val * val);
        }
        if (Integer.parseInt(num) == sum)
            System.out.println(sum + " is an Armstrong number.");
    }
}
