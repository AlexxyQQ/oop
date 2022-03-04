package ExamQues;

public class Encapsulationonly {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize values
    Encapsulationonly(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class TestEncapsulationonly {
    public static void main(String[] args) {

        // create object of Area
        // pass value of length and breadth
        Encapsulationonly rectangle = new Encapsulationonly(9, 6);
        rectangle.getArea();
    }
}
