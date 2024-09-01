package com.example.javarevision;

class Parent{
    static int x=100;
    public static void fun(){
        System.out.println("function Parent");
    }
    public static void fun1(){
        System.out.println("function fun1");
    }
}
class child extends Parent{
    static int y=90;
    //function hiding not overriding with static functions.
    public static void fun(){
        System.out.println("function child");
    }
}
public class StaticInheritance {
    public static void main(String[] args) {
    child.fun();
    child.fun1();
        System.out.println(child.x+" "+child.y);
    }
}
