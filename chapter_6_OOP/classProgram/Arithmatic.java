package chapter_6_OOP.classProgram;

public class Arithmatic {
    private double num1;
    private double num2;
    private double num3;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public Arithmatic() {

    }

    public double Add() {
        return num1 + num2 + num3;
    }

    public double Sub() {
        return num1 - num2 - num3;
    }

    public double Mul() {
        return num1 * num2 * num3;
    }

    public double Div() {
        return num1 / num2;
    }

}
