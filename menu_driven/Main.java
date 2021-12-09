package menu_driven;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu driven Program");
        System.out.println("-------------------");
        System.out.println("1. Add two numbers");
        System.out.println("2. Simple intrest");
        System.out.println("3. Palindrome Number");
        System.out.println("4. Odd or Even");

        System.out.print("Enter your choice (1,2,3,4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                double num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = num1 + num2;
                System.out.println("Your answer is " + result);
                break;

            case 2:
                System.out.print("Enter the principle: ");
                double p = sc.nextDouble();
                System.out.print("Enter the rate: ");
                double r = sc.nextDouble();
                System.out.print("Enter the time: ");
                double t = sc.nextDouble();

                double result2 = (p * t * r) / 100;
                System.out.println("Your simple intrest is: " + result2);

                break;

            case 3:
                System.out.print("Enter the number to check whether it's palindrome or not:");
                int number = sc.nextInt();
                int number_length = String.valueOf(number).length();
                System.out.println(number_length);
                int divder = 10;
                int remainder = number % divder;
                int quotient = number / divder;
                int result3 = remainder * divder + quotient;

                if (result3 == number) {
                    System.out.print(number + " is a palindrome.");
                } else {
                    System.out.print(number + " is not a palindrome.");
                }

                break;

            case 4:
                System.out.print("Enter a number: ");
                int user_number = sc.nextInt();

                if (user_number % 2 == 0) {
                    System.out.println("Your number is Even.");

                } else {
                    System.out.println("Your number is Odd.");
                }
                break;

            default:
                System.out.println("Wrong choice");

        }
    }

}