package 历届试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-03-10 15:35
 */
public class 高僧斗法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String[] s = str.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < arr.length-1; i++) {
            int org = arr[i];
            for (int j = arr[i]+1; j <arr[i+1]; j++) {
                arr[i]=j;
                if (deal(arr)){
                    System.out.println(org+" "+arr[i]);
                    return;
                }
            }
            arr[i] = org;
        }
        System.out.println(-1);
    }
    static boolean deal(int[] A){
        int len = A.length;
        //Arrays.sort(A);
        int res = 0;
        //if ((len&1)==1){   //奇数
            for (int i = 0; i < len-1; i+=2) {
                res ^= (A[i+1]-A[i]-1);
            }
       // }else{
           /* for (int i = 1; i < len; i++) {
                res ^= (A[i]-A[i-1]-1);
            }
        }*/
        if (res==0){
            return true;
        }else{
            return false;
        }
    }
}
