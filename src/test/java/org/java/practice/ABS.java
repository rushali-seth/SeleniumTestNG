package org.java.practice;
abstract class NewInt{
    abstract void meth1();
    public void meth2(){
        System.out.println("meth2 concrete");
    }
}

interface NewString {
    void interface1();
    void interface2();

}
public class ABS extends NewInt implements NewString {
  public void meth1(){
      System.out.println("meth1 abstract");
  }
  public void aBSMeth(){
      System.out.println("ABS Method abstract");
  }

  public void interface1(){

  }

    public void interface2(){

    }

    public static void main(String[] args){
      NewInt ni = new ABS();
      ni.meth1();
      ni.meth2();


      ABS ab = new ABS();
      NewString ns = new ABS();



    }
}
