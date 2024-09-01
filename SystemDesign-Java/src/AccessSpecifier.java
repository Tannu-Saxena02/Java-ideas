 class AccessSpecifier {
      private final void getDetails(String s)
        {
            System.out.println("Derived class"+s);
        }
     public  final void showDetails()
     {
         System.out.println("showed Details");
     }
    }

//Imp concepts:
// Private members is inherited to subclass but not accessible to subclass and other classes,
// so here we write private final the method is not override due to private access specifier and due to this
// it cannot be overriden .no effect of final keyword in this case.
 //NO COMPILATION ERROR
class Test extends AccessSpecifier {
   public final void getDetails(String s)
    {
        System.out.println("test class"+s);
    }

}
class MainFun{
    public static void main(String[] args) {
        Test t=new Test();
        t.getDetails("sss");
        t.showDetails();
        System.out.println("Try programiz.pro");
    }
}
