package

���ű�������Ƶ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-01-11 23:26
 */
public class Recursion {
    /**
     * ��ת�ַ���
     *
     * @param src
     * @param end
     * @return
     */
    static String reverse(String src, int end) {
        if (end == 0) {
            return "" + src.charAt(0);
        }
        return src.charAt(end) + reverse(src, end - 1);
    }
    /*@param
    @return
    ��������  �ݹ�ʵ��
     */

    static void insertSort(int[] arr, int k) {
        if (k == 0)
            return;
        insertSort(arr, k - 1);
        int x = arr[k];
        int index = k - 1;
        while (index > -1 && x < arr[index]) {
            arr[index + 1] = arr[index];
            index--;
        }
        arr[index + 1] = x;
        System.out.println(Arrays.toString(arr));
    }

    /**
     * С����¥��  �ݹ�ʵ��
     *
     * @param n
     * @return
     */
    static int f1(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return f1(n - 1) + f1(n - 2) + f1(n - 3);
    }

    /**
     * ��С����Id  �ݹ�ʵ��
     *
     * @param arr
     * @param l
     * @param r
     * @return
     */
    static int find(int[] arr, int l, int r) {
        if (l > r)
            return l + 1;
        int midIndex = l + ((r - l) >> 1);
        int q = arr[midIndex];
        int t = midIndex + 1;
        if (t == q)
            return find(arr, midIndex + 1, r);
        else
            return find(arr, l, midIndex - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(reverse("abcd",3));
//        int arr[]={6,3,2,1};
//        insertSort(arr,3);
//        System.out.println();
//        while (true){
//            int n=sc.nextInt();
//            System.out.println(f1(n));
//        }
        int[] arr = {1, 2, 3, 4};
        System.out.println(find(arr, 0, 3));
    }
}
