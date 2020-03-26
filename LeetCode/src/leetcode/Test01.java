package leetcode;

import java.util.concurrent.ForkJoinPool;

/**
 * @author wl
 * @Data 2020-03-25 11:29
 */
public class Test01 {
    public static void main(String[] args){
        int n=1200000;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0)
                count++;
        }
        System.out.println(count);
    }
}
