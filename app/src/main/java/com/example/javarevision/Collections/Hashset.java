package com.example.javarevision.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println(hs);
        LinkedHashSet lh=new LinkedHashSet();
        lh.add("one");
        lh.add("two");
        lh.add("three");
        lh.add("four");
        lh.add("five");
        System.out.println(lh);

    }
}
