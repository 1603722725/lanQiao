package 蓝桥杯辅导视频;

import java.util.Scanner;



/**
 * @author wl
 * @Data 2020-04-17 22:34
 */
public class dfs素数环 {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        dfs(arr,n,1);
        if (cnt == 0){
            System.out.println("no answer");
        }else {
            System.out.println(cnt);
        }
    }
    private static void dfs(int[] arr, int n, int k) {
        if (k==n && isSu(arr[0]+arr[k-1])){
            print(arr);
            cnt++;
            return;
        }
        for (int i = 2; i <= n; i++) {
            if (check(arr, k, i)){
                arr[k] = i;
                dfs(arr,n,k+1);
               // arr[k]=0;
            }
        }
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static boolean check(int[] arr,int k,int i){
        if (!isSu(arr[k-1]+i)) return false;
        for (int j = 0; j < k; j++) {
            if (arr[j]==i) return false;
        }
        return true;
    }
    static boolean isSu(int j){
        for (int i = 2; i < j/2; i++) {
            if (j%i==0) return false;
        }
        return true;
    }
}
