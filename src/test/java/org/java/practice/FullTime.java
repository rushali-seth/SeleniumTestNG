package org.java.practice;

public class FullTime extends Employee{

    @Override
    int salary(){
        return base + 20000;
    }

    static String designation(){
        return "full-time";
    }

}
