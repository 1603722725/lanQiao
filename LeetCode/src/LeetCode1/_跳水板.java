package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-08 7:54
 */
public class _ÌøË®°å {
    public static void main(String[] args) {

    }

    public int[] divingBoard(int shorter, int longer, int k) {
        int[] arr = new int[0];
        if (k == 0) {
            // arr[0] = 0;
            return arr;
        }
        arr = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            arr[i] = shorter * (k - i) + longer * i;
        }
        return arr;
    }
}
