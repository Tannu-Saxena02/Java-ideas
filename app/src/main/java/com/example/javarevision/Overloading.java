package com.example.javarevision;
class A{
    public void fun(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void fun(int x){
        System.out.println("class B "+x);
    }
}
public class Overloading {
    public static void main(String[] args) {
        B b=new B();
        b.fun(4);
        b.fun();
    }
}
