package com.example.javarevision;
class Parent1{
    public Parent1(){
        System.out.println("Parent class");
    }
}
class Child1 extends Parent1{
    public Child1(){
        this(23);
        System.out.println("Child class");
    }

    public Child1(int x){
        //first line super() hogi
        System.out.println("Hi Child class"+x);
    }

}
public class ConstructorChaining {
    public static void main(String[] args) {
    Child1 c=new Child1();

    }
}
