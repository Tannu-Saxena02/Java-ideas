package com.example.javarevision.Collections;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet();
        //null insertion is not allowed but in java version no 6 or before is allowed
        t.add("A");
//        t.add(null);
        //heterogeneous objects are not allowed
        t.add(1);
        System.out.println(t);
    }
}
