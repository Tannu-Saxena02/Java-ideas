package com.example.javarevision.Collections;

import java.util.TreeSet;

public class Sortedset {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        t.add("A");
        t.add("D");
        t.add("B");
        t.add("C");
        //Hetergenous objects ar not allowed
        //null insertion is not allowed
        //sortedset Methods
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("D"));
        System.out.println(t.tailSet("A"));
        System.out.println(t.subSet("A","D"));
        System.out.println(t.comparator());

        //navigableSet methods:
        System.out.println(t.ceiling("D"));
        System.out.println(t.floor("A"));
        System.out.println(t.higher("D"));
        System.out.println(t.lower("A"));





    }
}
