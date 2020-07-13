package Test;

public class Test01 {
    public static void main(String[] args) {
        int a[] = {5, 2, 3, 4, 1};
        Qsort(a, 0, 4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
    }

    //��������   �ڿ�+����
    public static void Qsort(int arr[], int l, int h) {
        if (l < h) {
            int i = l, j = h;
            int x = arr[l];
            while (i < j) {
                while (i < j && arr[j] > x) j--;
                if (i < j) arr[i++] = arr[j];
                while (i < j && arr[i] < x) i++;
                if (i < j) arr[j--] = arr[i];
            }
            arr[i] = x;
            Qsort(arr, l, i - 1);
            Qsort(arr, i + 1, h);
        }
    }
}
