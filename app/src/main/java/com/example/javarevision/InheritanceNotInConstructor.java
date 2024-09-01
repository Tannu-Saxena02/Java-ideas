package com.example.javarevision;
class Dog{
//   public Dog(){
//       System.out.println("Constructor Dog");
//   }
   public Dog(int x){
       System.out.println("parametrised const dog");
   }
}
class Cat extends Dog{
    public Cat(){
        super(10);
        System.out.println("Constructor Cat");
    }
}

public class InheritanceNotInConstructor {
    public static void main(String[] args) {
    Cat c=new Cat();
    }
}
