package ExamQues;

abstract class AbstractClassEx {
    abstract void draw();
}

class Rectangle extends AbstractClassEx {

    @Override
    void draw() {
        System.out.println("Rectangle");

    }

}

class Circle extends AbstractClassEx {
    void draw() {
        System.out.println("Circle");
    }
}

class TestAbs {
    public static void main(String[] args) {
        AbstractClassEx rect = new Rectangle();
        rect.draw();
    }

}
