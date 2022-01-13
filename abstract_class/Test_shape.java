package abstract_class;

public class Test_shape {
    public static void main(String[] args) {
        Shape Circle = new Circle(5);
        System.out.println(Circle.area());

        Shape Triangle = new Triangle(5, 5);
        System.out.println(Triangle.area());
    }

}
