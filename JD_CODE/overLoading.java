public class overLoading {
    public static void main(String[] args) {
        A obj=new A();
 String s1=  obj.Add("kumar");
      int s2=  obj.Add(2,5, 3);
      int s3=  obj.Add(5, 0);
      System.out.println(s1+s2+s3);
       
    }
}
class A{
    public int Add(int a,int b){
        return a+b;
    }
    public int Add(int a,int b,int c){
        return a+b+c;

    }
    public String Add(String s){
        return "shivam";
    }
}