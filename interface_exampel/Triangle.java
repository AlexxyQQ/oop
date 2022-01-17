package interface_exampel;

public class Triangle implements Shape {
    private float length, breadth;

    Triangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    @Override
    public float area() {
        return 1 / 2f * length * breadth;
    }

    @Override
    public String draw() {
        return "I am a Triangle";
    }

}
