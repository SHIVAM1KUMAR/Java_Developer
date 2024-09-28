public class Anonymosclass {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show(){
                System.out.println("In Inner class Annoymos class ");
            } 
        };
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("In A show");
    }
}
