package

���ű�������Ƶ;


import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-01-13 21:17
 * ϣ������
 */
public class shellSort {
    public static void shellSort1(int[] arr) {
        for (int interval = arr.length / 2; interval > 0; interval = interval / 2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];
                int j = i - interval;
                while (j > -1 && target < arr[j]) {
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j + interval] = target;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1, 5};
        shellSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
