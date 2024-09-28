public class Statics {
    public static void main(String[] args) {
        Mobile mb=new Mobile();
        mb.brand="Redmi";
        mb.price=12999;
        mb.name="Phone";
        mb.show();
            Mobile.show1(mb);

    }
}
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        //instanse
        System.out.println(brand +":"+price+":"+name);
    }

    public static void show1(Mobile mb){
        //static method
        System.out.println(mb.brand +":"+mb.price+":"+name);
    }
}