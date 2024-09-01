public class Concept {
    int x=20;
    public Concept(String s){
        System.out.println("value is"+x);
    }
    void Display(){
        System.out.println(x);
    }
}
 class B extends Concept{
    int x=10;
  public B(String s){
      super("parent constructor");

      System.out.println("B Class");
  }
  void Display(){
      System.out.println(x);
  }
}
class Mainn{
    public static void main(String[] args) {
//        new B("hhh").Display();
       new B("hii").Display();
//        b.Display();
        System.out.println(" ");
    }
}
