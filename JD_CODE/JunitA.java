public class JunitA {
    public static void main(String[] args) {
        Calc c=new Calc();
       int res= c.div(10,5);
       System.out.println(res);
       if (res==2)
       System.out.println("Test case pass");
       else
       System.out.println("Test case not pass");


       int res2= c.div(10,1);
       System.out.println(res);
       if (res2==2)
       System.out.println("Test case pass");
       else
       System.out.println("Test case not pass");
    }
}
class Calc{
    public int div(int n1,int n2){
        return n1/n2;
    }
    
        public int Mul (int n1,int n2){
            return n1*n2;
        }
    }


