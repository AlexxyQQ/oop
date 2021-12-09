package javaprox;

import java.util.Scanner;

public class medical {
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

        System.out.print("Did you have a medical cause? (Y/N): ");
        String yn = sc.next().toUpperCase();
        if (yn.length() > 1) {
            System.out.println("You Should have typed Y or N.");
        }
        if (yn.contains("Y")) {
            System.out.println("Ok you are allowed to sit in the exam");
        }
        if (yn.contains("N")) {
            System.out.println("You are still not allowed to sit in the exam");
        }

    }
}
