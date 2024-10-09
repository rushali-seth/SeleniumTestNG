package org.java.practice;

import java.util.Arrays;

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
    public static void main(String[] args){
        System.out.println(isAnagram("ridver", "drier"));

    }
}
