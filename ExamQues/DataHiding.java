package ExamQues;

class DataHiding {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class DataHidingTest {
    public static void main(String[] args) {
        // create object
        DataHiding personone = new DataHiding();
        // using setter
        personone.setAge(21);
        // access age using getter
        System.out.println("age is " + personone.getAge());
    }
}