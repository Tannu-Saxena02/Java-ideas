package com.example.javarevision;
class Box{
    int l,b,h;
    public void setDimensions(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void getDimension()
    {
        System.out.println("length "+l+"breadth "+b+"height "+h);
    }
}
public class This {
    public static void main(String[] args) {
        Box b=new Box();
        b.setDimensions(2,45,67);
        b.getDimension();
    }
}
