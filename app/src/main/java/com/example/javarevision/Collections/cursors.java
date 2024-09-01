package com.example.javarevision.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class cursors {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("onne");
        v.add("two");
        v.add("three");
        v.add("four");
        System.out.println(v);

        //Enumeration:
//        Enumeration e=v.elements();
////        ye eke object bna h jisne enumeration class ko implements kiya h
////        enumeration k pass two methoda hote h hasmoreElements and nextElement
//        while(e.hasMoreElements())
//        {
//            String s=(String) e.nextElement();
//            System.out.println(s);
//        }
//Iterator:
        ArrayList al=new ArrayList();
        for(int i=0;i<10;i++)
        {
            al.add(i);
        }
        System.out.println(al);
//        Iterator it=al.iterator();
//        while(it.hasNext())
//        {
//            Integer i=(Integer) it.next();
//            if(i>3&&i<8)
//                it.remove();
//        }
//        System.out.println(al);
        LinkedList ll=new LinkedList();
        ll.add("Java");
        ll.add("C");
        ll.add("C++");
        ll.add("PHP");
        System.out.println(ll);
        ListIterator l=ll.listIterator();
        while(l.hasNext())
        {
            String s=(String) l.next();
            if(s.equals("Java"))
                l.set("Java SE");
            else if(s.equals("C"))
                l.set("DSA");
            else if(s.equals("PHP"))
                l.remove();
        }
            System.out.println(ll);

    }
}
