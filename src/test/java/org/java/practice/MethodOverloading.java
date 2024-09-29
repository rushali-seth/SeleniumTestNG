package org.java.practice;

public class MethodOverloading {

    public void methOver(String str){
        System.out.println(str);
    }

    public void methOver(String str, int i){
        System.out.println(str + i);
    }

public static void main(String[] args){

    MethodOverloading mo = new MethodOverloading();
    mo.methOver("name" , 2);



}
}
