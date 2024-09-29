package org.java.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Misc {
    public static void main(String[] args){
        String n = "Rushali";
        String p = "Rushali Seth";
        System.out.println(n.charAt(1));
        System.out.println(n.concat(" " + p));
        System.out.println(n.substring(2,4));
        System.out.println(n.contains("S"));
        System.out.println(n.indexOf('s'));
        System.out.println(n.substring(2, 4));
        for(int i=0;i<n.length(); i++){
            System.out.print(n.charAt(i));
        }
        System.out.println();
        char[] cha = n.toCharArray();
        for(int i=0;i<cha.length; i++){
            System.out.print(cha[i] + "+");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter int: ");
        int name = sc.nextInt();
        System.out.println("int value: " + name*name);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter sentence: ");
        String sentence = sc1.next();
        System.out.println("sen is" + sentence);

        String[] names = {"rus", "hal", "li", "se", "th"};
        for(int i=0;i<names.length; i++){
            System.out.println(names[i]);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
    }
}



