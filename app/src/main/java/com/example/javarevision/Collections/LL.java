package com.example.javarevision.Collections;

import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.addFirst("SOurabh");
        l.addLast("Shukla");
        l.add(1,"Kumar");
        System.out.println(l.getFirst());
        System.out.println(l.get(1));
        System.out.println(l.getLast());

    }

}
