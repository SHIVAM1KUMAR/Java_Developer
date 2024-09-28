public class Exceptionss {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]=new int[5];

        try{
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be In Your Limit");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    

}
