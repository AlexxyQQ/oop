package chapter_6_OOP.polymorphism;

public class TestShape {
    public static void main(String[] args) {
        Shape Circle = new Circle();
        System.out.println(Circle.area(5));

        Shape Triangle = new Triangle();
        System.out.println(Triangle.area(5, 5));

        Shape Rectangle = new Rectangle();
        System.out.println(Rectangle.area(6.3f, 5.6f));

    }

}
