package com.example.javarevision;
final class Example{
   public final int x=45;
   public final static int y=90;
   public final void fun()
   {
       System.out.println("Hello fun");
   }
}
//class AB extends Example{
//    public void fun()
//    {
//        System.out.println("Hello fun");
//    }
//}
public class Final {
    public static void main(String[] args) {
        Example ex=new Example();
//        ex.x=3;
        System.out.println("value of y is"+Example.y);
//        Example.y=10;
    }
}
