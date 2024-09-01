package com.example.javarevision;
class Car{
    public void shiftGear(){
        System.out.println("Car class");
    }
}
class SportsCar extends Car{
    public void shiftGear(){
        System.out.println("SportsCar class");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Car sc=new SportsCar();
        sc.shiftGear();
    }
}
