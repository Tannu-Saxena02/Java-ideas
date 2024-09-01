package Inheritance;

public class MotorCycle extends Vehicle{
    private String handleBarStyle;
    private String SuspensionType;
    MotorCycle(){
        this.handleBarStyle="";
        this.SuspensionType="";
    }
    MotorCycle(String handleBarStyle,String SuspensionType){
        this.handleBarStyle=handleBarStyle;
        this.SuspensionType=SuspensionType;
    }
    public void wheelie(){
        System.out.println("Motorcycle working");
    }
}

