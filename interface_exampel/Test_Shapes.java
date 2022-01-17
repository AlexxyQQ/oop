package interface_exampel;

public class Test_Shapes {
    public static void main(String[] args) {

        Shape Circle = new Circle(4);
        System.out.println(Circle.area());
        Shape Triangle = new Triangle(4, 5);
        System.out.println(Triangle.area());
    }
}
