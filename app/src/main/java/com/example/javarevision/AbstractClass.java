package com.example.javarevision;
abstract class Animal{
abstract public void walk();
public void Feed(){
    System.out.println("feeding");
}
}
class Dogs extends  Animal{
    public void walk()
    {
        System.out.println("dog can walk");
    }
    public void Feed(){
        System.out.println("dog feeds");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
    Dogs d=new Dogs();
    d.walk();
    d.Feed();
    }
}
