package abstract_class;

/**
 * Triangle
 */
public class Triangle extends Shape {
    private float length, bredth;

    Triangle(float length, float bredth) {
        this.length = length;
        this.bredth = bredth;

    }

    @Override
    protected float area() {

        return 1 / 2f * length * bredth;
    }

}