package javaprox;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("quantity: ");
        int quantity = sc.nextInt();

        int cost = 100;
        float TotalCost = quantity * cost;
        float result;
        result = TotalCost;
        if (TotalCost > 1000) {
            result = TotalCost - TotalCost * 10 / 100;
            System.out.println("yes");
        }

        System.out.println(result);
    }

}
