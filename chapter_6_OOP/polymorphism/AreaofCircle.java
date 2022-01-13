package chapter_6_OOP.polymorphism;

public class AreaofCircle {
    public static void main(String[] args) {
        System.out.println(area(3));
        System.out.println(area(3.4f));

    }

    public static float area(int r) {
        return 3.14f * r * r;

    }

    public static float area(Float r) {
        return 3.14f * r * r;

    }
}
