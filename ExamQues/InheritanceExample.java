package ExamQues;

class InheritanceExample {

    String name;

    public void eat() {
        System.out.println("I can't eat");
    }
}

class Dog extends InheritanceExample {

    public void display() {
        System.out.println("My name is " + name);
    }
}

class TestInheritanceExample {
    public static void main(String[] args) {

        Dog Stray = new Dog();

        Stray.name = "Tony";
        Stray.display();

        Stray.eat();

    }
}