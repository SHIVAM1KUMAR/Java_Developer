public class method {
    public static void main(String[] args) {
        computer obj=new computer();
        obj.playmusic();
        String str =obj.getMeAPen(12);
        System.out.println(str);
    }
}
class computer{
    public void  playmusic(){
        System.out.println("Music Playing");
    }
    public String getMeAPen(int cost){
        if(cost>=10)
        return "pen";

        else
        return"nothing";
    }
}