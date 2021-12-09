package classwork_1;
import java.util.Scanner;

public class Grater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        // Input
        int first = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second = sc.nextInt();
        if (first == second) {
            System.out.print("Both numbers are equall.");
        }
        if (first > second) {
            System.out.print("First Number is grater.");
        }
        if (second > first) {
            System.out.print("Second Number is grater.");
        }
    }
}
