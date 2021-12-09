package classwork_1;

import java.util.Scanner;

public class GraterThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Enter First Number: ");
        int first = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int third = sc.nextInt();

        if (first > second & first > third) {
            System.out.printf("First number %d is grater.", first);
        }
        if (first < second & second > third) {
            System.out.printf("Second number %d is grater.", second);
        }
        if (third > second & third > first) {
            System.out.printf("Third number %d is grater.", third);
        }

    }
}
