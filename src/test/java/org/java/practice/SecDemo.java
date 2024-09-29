package org.java.practice;

public class SecDemo {

    public void myMethod(){

        FirstDemo fd = new FirstDemo();
        fd.initialize();
        System.out.println(fd.i);
    }

public static void main(String[] args){
        SecDemo sc = new SecDemo();
        sc.myMethod();



}

}
