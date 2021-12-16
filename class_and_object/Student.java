package class_and_object;

import java.util.Set;

public class Student {
    private String fname;
    private String lname;
    private int age;

    // constructor
    public Student(String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;

    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Fname: " + fname + " Lname: " + lname + " age:" + age;
    }
}
