package org.java.practice;

public class SubClass extends SuperClass{
    public SubClass(){
        super("super constr");
        System.out.println("Subclass constructor");
    }

    public void subClassMeth(){
        System.out.println("Subclass method");
    }
}
