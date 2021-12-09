package array;

import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }
}
