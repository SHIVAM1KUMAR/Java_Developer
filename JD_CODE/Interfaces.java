public class Interfaces {
    public static void main(String[] args) {
        Computer lap =new Laptop();
        Computer desk=new Desktop();
        Developer shivam =new Developer();
        shivam.devApp(lap);
    }
}
/**
 * InnerInterfaces
 */
 interface Computer {
void code();    
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code,compile,run ");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code,compile,run ,faster");
    }
}

class Developer {
    public void devApp(Computer desk){
        desk.code();
    }
}