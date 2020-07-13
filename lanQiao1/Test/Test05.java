package Test;

public class Test05 {
    //��̷�������������ۼӺ�
    public static void main(String[] args) {
        int a[] = {1, -2, 3, -1, 5, -2, 6, -1};
        System.out.println(findMax(a));
    }

    //���Ʒ�O(n)
    public static int findMax(int arr[]) {
        int sum = arr[0];
        int max = sum;
        int left, right;
        for (int i = 1; i < arr.length; i++) {
            if (sum > 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
                left = i;//���±�
            }
            if (sum > max) {
                max = sum;
                right = i;//���±�
            }
        }
        return max;

    }

}
