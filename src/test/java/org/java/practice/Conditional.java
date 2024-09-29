package org.java.practice;

public class Conditional {

    public static void main(String[] args){
    Conditional c = new Conditional();
    c.ifElseCheck();
    c.loopCheck();
    c.forEach();
    c.whileLoop();
    c.switchSt();
    }

    public void ifElseCheck(){
        boolean flag=true;
        String str= "mystr";
        if(str.equalsIgnoreCase("mystr") && flag){
            System.out.println("i am in if");
        }
        else{
            System.out.println("i am in else");
        }

    }

    public void loopCheck(){
        for(int i=0;i<5; i++){
            if(i==3){
              continue;
            }
            System.out.println("i is = " + i);
        }
    }

    public void forEach(){
        String[] myArray = {"abc", "dgeh", "djfhd"};
        for(String str : myArray){
            System.out.println(str);
        }
    }

    public void whileLoop(){
        int k=5;
        while(k>0){
            System.out.println(k);
            k--;
        }
    }
    public void switchSt(){
        String str = "asgf";
        switch(str){
            case "abd":
                System.out.println("print abd");
                break;
            case "asgf":
                System.out.println("print otherwise");
                break;
        }

        }
}

