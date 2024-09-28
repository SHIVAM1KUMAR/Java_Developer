public class thisSuper {
    public static void main(String[] args) {
        B ob=new B(5);
    }
}
 class A{
        public A(){
            System.out.println("In A constructor");
        }
        public A(int n){
            super();
            System.out.println("In a Int");
        }

 }
 class B extends A{
          public B(){
            super();
              System.out.println("In B Constructor");
          }
          public B(int n){
            this();
            System.out.println("In b int ");
          }
 }