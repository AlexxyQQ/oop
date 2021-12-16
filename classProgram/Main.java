package classProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch;
        do {
            Arithmatic Ari = new Arithmatic();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            Ari.setNum1(sc.nextDouble());
            System.out.print("Enter Second number: ");
            Ari.setNum2(sc.nextDouble());
            System.out.print("Enter Third number: ");
            Ari.setNum3(sc.nextDouble());

            int cho = 0;
            System.out.print("What you wanna do: \n 1.Add \n 2.Sub \n 3.Mul \n 4.Div \n:");
            cho = sc.nextInt();

            switch (cho) {
                case 1:
                    System.out.println("Your answer is: " + (Ari.Add()));
                    break;
                case 2:
                    System.out.println("Your answer is: " + (Ari.Sub()));
                    break;
                case 3:
                    System.out.println("Your answer is: " + (Ari.Mul()));
                    break;
                case 4:
                    System.out.println("Your answer is: " + (Ari.Div()));
                    break;
                default:
                    System.out.println("Wrong Choice.");
                    break;
            }

            System.out.print("Do you wanna continue (y/n): ");
            ch = sc.next().toLowerCase().charAt(0);
        } while (ch == 'y');

    }
}
