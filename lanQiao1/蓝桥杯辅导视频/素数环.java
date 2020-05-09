package 蓝桥杯辅导视频;

/**
 * @author wl
 * @Data 2020-04-17 23:04
 */
import java.util.Scanner;
public class 素数环 {
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        res[0] = 1;//默认第一个为1
        dfs(res,n,1);
        if(cnt==0) {
            System.out.println("no solution!");
        }else {
            System.out.println(cnt);
        }
    }

    /**
     *
     * @param r 保存结果
     * @param n 素数的个数
     * @param k 当前个数
     */
    static void dfs(int[] r,int n,int k) {
        if(k == n && isSu(r[0]+r[k-1])) {
            printRes(r);
            cnt++;
            return;
        }
        for(int i=2;i<=n;i++) {
            if(check(r,k,i)) {
                r[k] = i;
                dfs(r,n,k+1);
                r[k] = 0;//可省略回溯
            }
        }
    }

    //打印素数环
    private static void printRes(int[] r) {
        for(int i=0;i<r.length;i++) {
            System.out.print(r[i]+"  ");
        }
        System.out.println();
    }
    /**
     *
     * @param r 存储数组
     * @param k 当前素数个数
     * @param i 是否可以填的值
     * @return
     */
    private static boolean check(int[] r,int k,  int i) {
        if(!isSu(r[k-1]+i))return false;//k-1是第k个素数在数组的中的位置
        for(int j=0;j<k;j++)if(i==r[j])return  false;//确保与之前的数没有重复的
        return true;
    }
    //判断是否为素数
    private static boolean isSu(int i) {
        for(int j=2;j<i;j++) {
            if(i%j == 0) return false;
        }
        return true;
    }
}