package 剑指;

/**
 * @author wl
 * @Data 2020-07-19 23:33
 */
public class _斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    public static int fib(int n) {
//        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;
        int[] f = new int[n];
        f[0] = 1;
        f[1] = 2;
        for (int i = 2; i < n; i++) {
            f[i] = (f[i-1]+f[i-2])%1000000007;
        }
        return f[n-1];
    }
}
