package com.example.javarevision.ui.theme;
abstract class baseActivity{
    public void getI(){
        System.out.println("we get parent i values");
    }
}
class base extends baseActivity{

    public  void get(){
        getI();
        System.out.println("we get child i values");
    }

}
public class Example  {
    public static void main(String[] args) {
        base b=new base();
        b.get();
    }
}