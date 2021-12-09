package array;

import java.util.Scanner;

/**
 * ArrayBeninging
 */
public class ArrayBeninging {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}