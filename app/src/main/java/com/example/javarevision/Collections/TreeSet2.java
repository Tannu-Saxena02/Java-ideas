package com.example.javarevision.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
//        TreeSet t=new TreeSet();
//        t.add("B");
//        t.add("D");
//        t.add("F");
//        t.add("A");
//        t.add("F");
        TreeSet t=new TreeSet(new Comparator<StringBuffer>() {
            @Override
            public int compare(StringBuffer o1, StringBuffer o2) {
               return o1.toString().compareTo(o2.toString());
            }
        });
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("F"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("F"));
        System.out.println(t);

    }
}
