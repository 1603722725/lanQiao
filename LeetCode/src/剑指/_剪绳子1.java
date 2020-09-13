package 剑指;

/**
 * @author wl
 * @Data 2020-07-24 19:28
 */
public class _剪绳子1 {
    public static void main(String[] args) {
        int res = cuttingRope1(120);
        System.out.println(res);
    }
    public static int cuttingRope(int n) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            int x = n/i;
            int y = n%i;
            int res = 0;
            if (y==0){
                res = 1;
                for (int j = 0; j < i; j++) {
                    res *= x % 1000000007;
                }
                // (int) Math.pow(x,i)%1000000007;
            }else{
                res = 1;
                for (int j = 0; j < y; j++) {
                    res *= (x+1)%1000000007;
                }
                for (int j = 0; j < i-y; j++) {
                    res *= x % 1000000007;
                }
//                res = res * (int) Math.pow(x,i-y)%1000000007;
            }
            ans = Math.max(ans,res) % 1000000007;
        }
        return ans;
    }
    // 大数乘积
    public static int cuttingRope1(int n){
        if (n <= 3) return n-1;
        int b = n%3,p = 1000000007;
        long res = 1,x = 3;
        for (int i = n/3 - 1; i >0 ; i /= 2){
            if (i%2 == 1) res = (res*x)%p;
            x = (x*x)%p;
        }
        if (b==0) return (int)(res*3%p);
        if (b==1) return (int)(res*4%p);
        return (int)(res*6%p);
    }
}
