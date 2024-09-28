    public class FunctionalInterfacesss {
        public static void main(String[] args) {
            A obj=(int i, int j) ->
                {
                    return i+j;
                    //System.out.println("In Show" + " ");
                };
           int result= obj.add(5 ,4);
           System.out.println(result);
        }
    }

    @FunctionalInterface
    interface  A {
        int add(int i,int j);

    }
    // class B implements A{
    //     public void show(){
    //         System.out.println("In Show");
    //     }
    // }