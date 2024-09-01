package com.example.javarevision.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        ArrayList a=new ArrayList();
        a.add("A");
        a.add("B");
        a.add(null);
        a.add(0,"C");
        a.addAll(l);
        System.out.println(a);
        a.remove("c");
        System.out.println(a);
//        a.removeAll(l);
//        System.out.println(a);
        a.retainAll(l);
        System.out.println(a);
        System.out.println(a.containsAll(l));
        System.out.println(a.size());
        a.set(0,"A");
        a.set(2,"A");
        System.out.println(a);
        System.out.println(a.get(0));
        System.out.println(a.indexOf("A"));
        System.out.println(a.lastIndexOf("A"));
        System.out.println(a.subList(0,1));
        Iterator it=l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
