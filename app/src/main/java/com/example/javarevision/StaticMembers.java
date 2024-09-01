package com.example.javarevision;

import java.lang.reflect.Member;

class Members{
    static int a;
    int b;
    static void setter(){
        a=78;
    }
    public void getter(){
        System.out.println("a is "+a+" "+"b is "+b);
    }
 }
public class StaticMembers {
    public static void main(String[] args) {
        System.out.println(Members.a);
        Members.a=3;
        System.out.println(Members.a);
        Members m=new Members();
        m.getter();
        Members.setter();
        m.getter();

    }
}
