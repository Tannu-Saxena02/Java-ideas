package com.example.javarevision;
class ThreadA implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread A"+i);
        }
    }

}
class ThreadB implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread B"+i);
        }
    }
}
public class ThreadsUsingRunnable {
    public static void main(String[] args) {
        Thread a=new Thread(new ThreadA());
        Thread b=new Thread(new ThreadB());
        a.start();
        b.start();
    }
}
