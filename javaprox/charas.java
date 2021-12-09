
package javaprox;

import java.util.Scanner;

public class charas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character. ");
        char inp = sc.next().charAt(0);

        if (Character.isUpperCase(inp)) {
            System.out.println("Uppercase");
        }
        if (Character.isLowerCase(inp)) {
            System.out.println("Lowercase");

        }
    }

}
