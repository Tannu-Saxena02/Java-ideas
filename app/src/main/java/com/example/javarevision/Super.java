package com.example.javarevision;

class AA{
    int x=9;
    public void fun(){
        System.out.println("FunAA");
    }
}
class BB extends AA{

    public void fun(){
//        super.x=90;
        super.fun();
        System.out.println("Fun"+x);
    }
}
public class Super {
    public static void main(String[] args) {
    BB b=new BB();
    b.fun();
    System.out.println(b.x);
    }
}
