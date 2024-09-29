package org.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Class1 {
     public static void main(String[] args){

         List<String> shoppingItems = new ArrayList<>();

         System.out.println("enter list of items: ");
         while(true){
             Scanner sc = new Scanner(System.in);
             String s = sc.next();
             shoppingItems.add(s);
             if(s.contains("done")){
                 shoppingItems.remove("done");
                 break;
             }
             System.out.println("enter more:");
         }
         System.out.print("total items bought:" + shoppingItems);







     }

}
