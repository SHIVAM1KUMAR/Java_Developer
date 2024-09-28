public class Inheritances {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1=obj.Add(25, 25);
        int r2=obj.Sub(25, 25);
        int r3=obj.Mul(25, 25);
        int r4=obj.Div(25,5);
       double r5=obj.power(5,2);
        System.out.println(r1+" :->"+r2+" :=>"+r3+":->"+r4+"=>"+r5);
    }
}
class Calc{
    public int Add(int a,int b){
        return a+b;
    }
    public int Sub(int a,int b){
        return a-b;
    }
}
 class AdvCalc extends Calc{
    public int Mul(int a,int b){
        return a*b;
    }
    public int Div(int a,int b){
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc{
   public double power(int a,int b){
    return Math.pow(a, b);
   }
}