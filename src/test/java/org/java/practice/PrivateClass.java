package org.java.practice;

public class PrivateClass {
    private static String str=  "private string";

    public void setStr(String str){
        this.str=str;
    }

    private String getStr(){
        return str;
    }

    public void setString(){
        System.out.println(str);
    }
    private void privateMethod(){
    System.out.println("private method");
    }


}
