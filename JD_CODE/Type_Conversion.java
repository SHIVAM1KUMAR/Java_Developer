public class Type_Conversion {
    public static void main(String[] args) {
        byte b=127;
        int a=b;
        System.out.println(a);
        int aa=12;
        byte k=(byte) aa;
        System.out.println(k);
        int A=257;
        byte x=(byte)A;//reminder
        System.out.println(x);

        float f=5.6f;
        int d=(int)f;
        System.out.println(d);

        byte h=10;
        byte g=20;

        int result =g*h;//type promotion
        System.out.println(result);
    }
}
