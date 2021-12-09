package javaprox;

import java.util.Scanner;

public class school {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        float marks = sc.nextFloat();
        String result;
        result = "Wrong Marks";
        if (marks < 25) {
            result = "Your Grade is F.";
        }
        if (marks > 25 & marks < 45) {
            result = "Your Grade is E.";
        }
        if (marks > 45 & marks < 50) {
            result = "Your Grade is D.";
        }
        if (marks > 50 & marks < 60) {
            result = "Your Grade is C.";
        }
        if (marks > 60 & marks < 80) {
            result = "Your Grade is B.";
        }
        if (marks > 80 & marks < 100) {
            result = "Your Grade is A";
        }

        System.out.println(result);
    }

}
