package com.example.javarevision;
class AThread extends Thread{
public void run()
{
    int i=0;
    for(i=0;i<10;i++)
        System.out.println("Thread A"+i);
}
}
class BThread extends Thread{
    public void run()
    {
        int i=0;
        for(i=0;i<10;i++)
            System.out.println("Thread B"+i);
    }
}
public class ThreadsUsingThreadClass {
    public static void main(String[] args) {
    Thread a=new Thread();
    Thread b=new Thread();
    a.start();
    b.start();
    }
}
