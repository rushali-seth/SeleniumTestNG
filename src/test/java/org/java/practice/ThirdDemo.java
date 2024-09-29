package org.java.practice;

public class ThirdDemo {
    String str = "Hello World";
    String name = "Rushali";
    String wr = "WORLD";


    public static void main(String[] args){
    ThirdDemo td = new ThirdDemo();
    td.initialize();
  //  td.initialize1();

    }

    public void initialize(){
        str = str.concat(" !!");
        str= str.toUpperCase();
        str = str.substring(6, 11);
        System.out.println(str);
        System.out.println(str.equals(wr));

        str = "3";
        int i = Integer.parseInt(str);
        System.out.println(str);
    }
    public void initialize1(){
      name = name.concat(" Seth");
        System.out.println(name);
    }

}
