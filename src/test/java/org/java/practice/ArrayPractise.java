package org.java.practice;

import java.util.*;

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

   public static void printDuplicatesInList(String[] arr){
        Set<String> s = new HashSet<>();
        for(String name : arr){
            if(!s.add(name)){
                System.out.println(name);
            }
        }

   }

   public static void reverseArray(String[] names){
        for(int i=names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }
   }

    public static void largestElementInArray(int[] arr){
     int max = arr[0];
     for (int i=1;i<arr.length; i++){
         if(arr[i]>max){
             max = arr[i];
         }
     }
     System.out.println("largest element : " + max);

    }

    public static void smallestElementInArray(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[0]<min){
                min = arr[0];
            }
        }
        System.out.println("smallest element : " + min);
    }

    public static void printSumArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void sortArrayInAsc(int[] arr){
       Arrays.sort(arr);
       for(int i=0;i<arr.length; i++){
           System.out.println(arr[i]);
       }
    }

    public static void secondLargestElement(int[] arr){
        int temp;
        for(int i=0;i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println(arr[1]);
    }

    public static void printOddEvenNos(int[] arr){
        for(int i=0;i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println("number even : " + arr[i]);
            }
            else{
                System.out.println("number odd : " + arr[i]);
            }
        }
    }

    public static void removeSpacesFromString(String sen){
       sen =  sen.replaceAll("\\s", "");
        System.out.println(sen);
    }

    public static void wordsInString(String str){
        String[] words = str.split(" ");
        System.out.println(words.length);

    }

    public static void printFirstLetter(String str){
        String[] s = str.split(" ");
        for(int i=0;i<s.length; i++){
            for(int j=0; j<s[i].length(); j++){
                System.out.println("first character of every word " + s[i].charAt(0));
                break;
            }
        }
    }




    public static void main(String[] args){
//        System.out.println(isAnagram("rider", "drier"));

          String[] aa = {"aa", "aa", "dd", "cc", "ss", "cc"};
  //      printDuplicatesInList(aa);
          reverseArray(aa);

//          int[]  a = {2,3,4,5,6,6,1,60,300,30};
//          largestElementInArray(a);
//          smallestElementInArray(a);
//          printSumArray(a);
//          sortArrayInAsc(a);
//          secondLargestElement(a);
//          printOddEvenNos(a);
           removeSpacesFromString("this is a java programming lan");
           wordsInString("this is a java programming lan");
           printFirstLetter("here is my name as rushali");
           printFirstLetter("here is my name as rushali");

    }
}
