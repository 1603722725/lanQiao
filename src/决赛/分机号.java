package 决赛;
/**
 * @Author: wl
 * @Date: 2019/5/21 19:29
 */
public class 分机号 {
    static int ans = 0;
    public static void main(String[] args) {
        for (int i = 987; i>=210 ; i--) {
            int a,b,c;
            a=i%10;
            b=(i/10)%10;
            c=i/100;
            if(a<b && b<c)
                ans++;
        }
        System.out.println(ans);
    }
}
