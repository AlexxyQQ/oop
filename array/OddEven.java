package array;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Number of odd is " + odd + " and number of even is " + even);
    }
}
