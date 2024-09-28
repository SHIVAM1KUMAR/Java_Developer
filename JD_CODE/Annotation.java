public class Annotation {
    public static void main(String[] args) {
        B obj=new B();
        obj.showTheDataWhichBelongsThisClass();
        
    }
}
class A{
    public void showTheDataWhichBelongsThisClass(){
        System.out.println("In A show");
    }
}
class B extends A
{
    @Override
    public void showTheDataWhichBelongsThisClass(){
        System.out.println("In B show");
    }
}