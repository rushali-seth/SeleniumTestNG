package org.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Misc1 {
    public static void main(String[] args) {

        int sum=0;
        for(int i=10;i>=1; i--){
            System.out.println("Table of 2: " + 2*i);
        }

        int i=0;
        while(i<=3){
            System.out.println(i);
            i++;
        }

int b=1;
        do{
            System.out.println(b);
            b++;
        }while(b<5);

    int[] arr = new int[5];
    int[] arr1 = {1,2,3,4};
    for(int j=0;j<arr1.length; j++){
        System.out.println(arr1[j]);
    }
    for(int arr2:arr1){
        System.out.println(arr2);
    }
    Scanner sc = new Scanner(System.in);
    List<Integer> in = new ArrayList<>();
    Iterator<Integer> ii = in.iterator();
        while(ii.hasNext()){
            ii.next();
        }

    }
}
