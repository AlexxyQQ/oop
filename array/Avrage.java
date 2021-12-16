package array;

import java.util.Scanner;

public class Avrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {

            sum += arr[i];

        }
        System.out.println("Your avrage is " + (sum / arr.length));

    }
}
