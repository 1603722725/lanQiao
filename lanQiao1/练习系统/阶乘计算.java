package Á·Ï°ÏµÍ³;
import java.util.Scanner;
/**
 * @author wl
 * @Data 2020-03-11 16:03
 */
public class ½×³Ë¼ÆËã {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10000;
        int[] arr = new int[max];
        int jw = 0;
        int temp = 0;
        arr[0]=1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < max; j++) {
                temp = arr[j]*i+jw;
                jw = temp/10;
                arr[j]=temp%10;
            }
        }
        int aa = 0;
        for (int i = max-1; i >= 0; i--) {
            if (arr[i]!=0){
                aa = i;
                break;
            }
        }
        for (int i = aa; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
