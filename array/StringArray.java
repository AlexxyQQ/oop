package array;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many names: ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a name: ");
            arr[i] = sc.nextLine();

        }
        System.out.println("Your names are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }
}
