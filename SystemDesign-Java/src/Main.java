import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TreeSet t=new TreeSet();
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("F"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("F"));
        System.out.println(t);
    }
}