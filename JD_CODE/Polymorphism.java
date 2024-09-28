public class Polymorphism {
    //run time polymorphism
    public static void main(String[] args) {
        A ob=new A();
        ob.show();

        ob=new B();
        ob.show();

        ob=new C();
        ob.show();
    }
}
//compiletime polymorphism is overloading
class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}