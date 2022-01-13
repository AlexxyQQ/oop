package chapter_6_OOP.polymorphism;

public class Arithmatic {

    public static void main(String[] args) {

        System.out.println(add(5, 6));
        System.out.println(add(5.6f, 67.6f));
        System.out.println(add(5.1f, 6));
        System.out.println(add(5, 6.3f));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static Float add(Float a, Float b) {
        return a + b;
    }

    public static Float add(Float a, int b) {
        return a + b;
    }

    public static Float add(int a, Float b) {
        return a + b;
    }

}
