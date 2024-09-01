package com.example.javarevision;
interface I1{
 void f1();
}
interface I2{
    void f2();
}
class Examp implements I1,I2{
   public void f1(){
        System.out.println("helo f1");
    }
  public  void f2(){
        System.out.println("helo f2");
    }
}
public class Interface {
    public static void main(String[] args) {
    I1 ex=new Examp();
    ex.f1();
//    ex.f2();
    }
}
