package abstract_class;

/**
 * Circle
 */
public class Circle extends Shape {

    private float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    protected float area() {
        return 3.14f * radius * radius;

    }
}