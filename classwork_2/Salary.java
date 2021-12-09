package classwork_2;

import java.util.Scanner;

public class Salary {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        float salary = sc.nextInt();
        float gross_salary = 0;
        if (salary <= 10000) {
            gross_salary = salary + (salary * 20 / 100) + (salary * 80 / 100);
        }
        if (salary <= 20000) {
            gross_salary = salary + (salary * 25 / 100) + (salary * 90 / 100);
        }
        if (salary > 20000) {
            gross_salary = salary + (salary * 30 / 100) + (salary * 95 / 100);
        }
        if (salary < 9999) {
            System.out.print("you entered wrong salary");
            System.exit(0);
        }
        System.out.print("Your gross salary is " + gross_salary);
    }
}