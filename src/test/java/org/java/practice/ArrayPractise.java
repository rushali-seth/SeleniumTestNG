package org.java.practice;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPractise {

    public static boolean isAnagram(String a, String b){
      String str1 =  a.replaceAll("//s", "");
      String str2 =  b.replaceAll("//s", "");

      if(str1.length() != str2.length()){
          return false;
      }
      else{
         char[] c1 = str1.toLowerCase().toCharArray();
         char[] c2 = str2.toLowerCase().toCharArray();

         Arrays.sort(c1); Arrays.sort(c2);

       return Arrays.equals(c1, c2);

      }
    }

    public static void elementFrequencyInArray(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length; i++ ){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }

        }
       System.out.println( hm.entrySet());





    }
    public static void main(String[] args){
      //  System.out.println(isAnagram("ridver", "drier"));
        int[]  a = {2,3,4,5,6,6,6};
        elementFrequencyInArray(a);

    }
}
