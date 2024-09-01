package Inheritance;

public class Vehicle {
    private String name;
    private String model;
    private int noOfTyres;
    public Vehicle(){
        this.name="";
        this.model="";
        this.noOfTyres=0;
    }
    public Vehicle(String name,String model,int noOfTyres){
        this.name=name;
        this.model=model;
        this.noOfTyres=noOfTyres;
    }
    public void startEngine(){
        System.out.println("start engine");
    }
    public void stopEngine(){
        System.out.println("stop engine");
    }
}


