package chapter_6_OOP;

public class Programmer extends Employee2 {
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("The salary of Programmer is " + p.salary);
        System.out.println("The bonus of Programmer is " + p.bonus);
        System.out
                .println("The total monthly salary of Programmer is "
                        + (p.bonus + (int) p.dashanin_Bonus + (int) p.salary));

    }
}
