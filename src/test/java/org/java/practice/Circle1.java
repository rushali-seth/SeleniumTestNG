package org.java.practice;

public class Circle1 implements Shape1{

    String color;
    double radius;


    public Circle1(String color, double radius){
        this.color=color;
        this.radius=radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String info() {
        return "";
    }

    @Override
    public void defaultMethod() {

    }


}
