package javaprox;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age of first person: ");
        int first_person = sc.nextInt();

        System.out.print("Age of seconf person: ");
        int second_person = sc.nextInt();

        System.out.print("Age of third person: ");
        int third_person = sc.nextInt();

        String result = "All are of same age";

        if (first_person > second_person & first_person > third_person) {
            result = "First person is the oldest with age " + first_person;
        }
        if (second_person > first_person & second_person > third_person) {
            result = "Second person is the oldest with age " + second_person;
        }
        if (third_person > first_person & third_person > second_person) {
            result = "Third person is the oldest with age " + third_person;
        }

        System.out.println(result);
    }
}
