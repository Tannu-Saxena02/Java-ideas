package com.example.javarevision;

class Person{
    int age;
    String name;
    int rollno=900;
    public void setName(String n)
    {
        name=n;
    }
    public void getName()
    {
        System.out.println("name is"+name);
    }
    public void getAge() {
        System.out.println(age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{
    int rollno;
    public void setRollno(int r){
        rollno=r;
    }
    public void getRollno(){
        System.out.println("roll no is"+rollno);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Student st=new Student();
        st.name="Abhishek";
        st.getName();
        st.age=20;
        st.getAge();
//        st.rollno=203348480;
        st.getRollno();
        Person p=new Person();
        p.getAge();
        p.getName();
        p.name="bhola";
        p.getName();
        Person ps=new Student();
        ps.getName();
//        ps.getRollno cannot call;


    }
}
