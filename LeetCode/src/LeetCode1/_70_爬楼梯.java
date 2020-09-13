package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-18 10:45
 */
public class _70_ÅÀÂ¥Ìİ {
    public static void main(String[] args) {
        int res = climbStairs(3);
        System.out.println(res);
    }
    public static int climbStairs(int n) {
        if(n==0)
            return 0;
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int[] f = new int[n+1];
        f[1] = 1;f[2] = 2;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}
