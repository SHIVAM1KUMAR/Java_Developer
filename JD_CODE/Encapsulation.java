public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        Human ob=new Human(21,"SK");
        // obj.setAge(20);
        // obj.setName("shivam");
        System.out.println(obj.getName()+" :"+obj.getAge());
        System.out.println(ob.getAge()+":"+ob.getName());
    }
}

class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
       this. age=age;//due to same name use this key word 
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public Human(){//constructor Normal/default
        age=21;
         name="Shivam";
    }
    public Human(int a,String n){//constructor Normal/default
        age=a;
         name=n;
    }
}