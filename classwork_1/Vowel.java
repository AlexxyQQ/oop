package classwork_1;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char chr = sc.next().toLowerCase().charAt(0);
        switch (chr) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent");

        }
        // if (chr == 'a' | chr == 'e' | chr == 'i' | chr == 'o' | chr == 'u') {
        // System.out.print("Your character is vowel");
        // } else {
        // System.out.print("Your character is consonent.");
        // }
    }
}
