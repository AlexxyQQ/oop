package chapter_6_OOP;

public class Programmer extends Employee {
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("The salary of Programmer is " + p.salary);
        System.out.println("The bonus of Programmer is " + p.bonus);

    }
}
