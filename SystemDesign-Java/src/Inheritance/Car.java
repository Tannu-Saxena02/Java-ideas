package Inheritance;

public class Car extends Vehicle {
    private String TransmissionType;
    private int noOfDoors;
    Car(){
        this.TransmissionType="";
        this.noOfDoors=0;
    }
    Car(String TransmissionType,int noOfDoors){
        this.TransmissionType=TransmissionType;
        this.noOfDoors=noOfDoors;
    }
    public void startAc(){
        System.out.println("start Ac");
    }

}

