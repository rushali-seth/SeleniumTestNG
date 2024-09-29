package MOSelenium.MOSel;

import java.util.Scanner;

public class ExceptionHandling extends Exception{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age =  sc.nextInt();
        if(age<25){
            System.out.println("candidate ineligible");
            throw new NullPointerException();
        }
        else{
            System.out.println("candidate eligible");
        }











    }

}
