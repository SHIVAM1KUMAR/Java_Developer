public class overRiding {
    public static void main(String[] args) {
        B obj=new B();
        int r1=obj.Calc(4, 05);
        System.out.println(r1);
    }
}
class A {
    public int Calc(int a ,int b){
return a+b;
    }
}
class B  extends A{
     public int Calc(int a,int b){
        return a+b+5;
     }
}