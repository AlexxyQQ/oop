package array;

import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();

        }
        int highets = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > highets) {
                highets = arr[i];
            }

        }
        System.out.println("your highest is " + highets);
    }
}
