package chapter_6_OOP.polymorphism;

public class Shape {
    public float area(int r) {
        return 3.14f * r * r;
    }

    public float area(float l, float b) {
        return l * b;
    }

    public float area(int l, int b) {
        return 0.5f * l * b;
    }
}
