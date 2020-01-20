package À¶ÇÅ±­¸¨µ¼ÊÓÆµ;

/**
 * @author ÍôÀÚ
 * @date 2019/4/22 - 21:47
 */
public class ººÅµËþ {
    static int ans=0;
    public static void printHanoiTower(int n,String from,String help,String to){
        if(n==1){
            System.out.println("move"+n+"from"+from+"to"+to);
            ans++;
            return;
        }
        printHanoiTower(n-1,from,to,help);
        ans++;
        System.out.println("move"+n+"from"+from+"to"+to);
        printHanoiTower(n-1,help,from,to);
    }
    public static void main(String[] args){
        printHanoiTower(4, "A", "B", "C");
        System.out.println(ans);
    }
}
