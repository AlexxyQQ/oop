package array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        boolean found = false;

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a value to search: ");
        int search = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (search == arr[i]) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Your value is you in array.");
        } else {
            System.out.println("Your value is not you in array.");

        }
    }
}
