package javaprox;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of classes held: ");
        int classes_held = sc.nextInt();

        System.out.print("Number of classes attended: ");
        int classes_attended = sc.nextInt();
        if (classes_attended > classes_held) {
            System.out.println("You are joking right");
            System.exit(0);
        }

        float result = (classes_attended * 100) / classes_held;
        String output = "Wrong input";

        if (result >= 75) {
            output = "You are allowed to take exam with " + result;
        }
        if (result < 75) {
            output = "You are not allowed to take exam with " + result;
        }

        System.out.println(output);
    }
}
