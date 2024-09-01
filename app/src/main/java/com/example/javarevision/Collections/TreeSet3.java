package com.example.javarevision.Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator());
        Book b1=new Book("Java",100);
        Book b2=new Book("C++",200);
        Book b3=new Book("PHP",300);
        t.add(b1);
        t.add(b2);
        t.add(b3);
        System.out.println(t);
        Iterator it=t.iterator();
        while(it.hasNext())
        {
            Book b=(Book)it.next();
            System.out.println(b.getPrice()+" "+b.getTitle());
        }

    }
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book)o1;
        Book b2=(Book)o2;
        if(b1.getPrice()<b2.getPrice())
            return -1;
        else
            return 1;
    }
}
class Book {
    String title;
    int price;
    Book(String title,int price){
        this.title=title;
        this.price=price;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice(){
        return price;
    }


}

