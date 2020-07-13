package leetcode;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-02-17 17:11
 */
public class Test {
    /* 1.����һ����λ�������ÿһλ��������֡���ע����֤�������������ֲ�����λ����������ʾ��
             2.�ж����������Ƿ�Ϊ���ꡣ������������֮һ����Ϊ���꣺
     a)�ܱ�4���������Ҳ��ܱ�100����
     b)�ܱ�400����
 3.ʹ��forѭ����ӡ
 0
         5
         10
         15
         ...
         95
         100
         4.ʹ��forѭ������1��100֮�������ܱ�3���������ĺ�
 5.��ӡ100~999�����е�ˮ�ɻ���: (ˮ�ɻ������� ��������ÿһλ����������  153=1�����η�+5�����η�+3�����η�)
             6.�����1��+2��+3��+..5!��ֵ
 7.����һ���������飬���������������Ԫ�صĺͣ�����������Ԫ�غ���������С��Ԫ�أ��������
             8.��һ�����飺8��4��2��1��23��344��12
             1��ѭ��������е�ֵ
  2����������������ֵ�ĺ�
  3��ʹ��ð������Ϊ�������������������Ľ��
 */
    public static void main(String[] args) {
//       print(12345);
//       boolean result = isLeapYear(2022);
//       System.out.println(result);
//       print1();
//       sumThree();
//       numberFlower();
//       print2();
        int[] arr = {10, 2, 3, 4, 5, 1};
        print3(arr);
    }

    /**
     * 1.����һ����λ�������ÿһλ��������֡���ע����֤�������������ֲ�����λ����������ʾ��
     *
     * @param num
     */
    static void print(int num) {
        int len = String.valueOf(num).length();
        if (len == 5) {
            int i = 5;
            while (i > 0) {
                System.out.println(num % 10);
                num /= 10;
                i--;
            }
        } else {
            System.out.println("�Ƿ����룡����");
        }
    }

    /**
     * 2.�ж����������Ƿ�Ϊ���ꡣ������������֮һ����Ϊ���꣺
     * a)�ܱ�4���������Ҳ��ܱ�100����
     * b)�ܱ�400����
     *
     * @param year
     * @return
     */
    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    /**
     * 3.ʹ��forѭ����ӡ
     */
    static void print1() {
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
    }

    /**
     * 4.ʹ��forѭ������1��100֮�������ܱ�3���������ĺ�
     *
     * @return
     */
    static int sumThree() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    /**
     * 5.��ӡ100~999�����е�ˮ�ɻ���: (ˮ�ɻ������� ��������ÿһλ����������  153=1�����η�+5�����η�+3�����η�)
     */
    static void numberFlower() {
        for (int i = 153; i <= 999; i++) {
            int a = i / 100;
            int b = (i - a * 100) / 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c)
                System.out.println(i);
        }
    }

    /**
     * 6.�����1��+2��+3��+..5!��ֵ
     */
    static void print2() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int a = 1;
            for (int j = i; j >= 1; j--) {
                a *= j;
            }
            System.out.println(a);
            sum += a;
        }
        System.out.println(sum);
    }

    /**
     * 7.����һ���������飬���������������Ԫ�صĺͣ�����������Ԫ�غ���������С��Ԫ�أ��������
     *
     * @param arr
     */
    static void print3(int[] arr) {
        int sum = 0;
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
//        Arrays.sort(arr);
//        max = arr[arr.length-1];
//        min = arr[0];
        bubbleSort(arr, arr.length);
        max = arr[arr.length - 1];
        min = arr[0];
        System.out.println(max + "   " + min);
    }

    /**
     * 8.��һ�����飺8��4��2��1��23��344��12
     * 1��ѭ��������е�ֵ
     * 2����������������ֵ�ĺ�
     * 3��ʹ��ð������Ϊ�������������������Ľ��
     */
    static void print4() {
        int[] arr = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
        bubbleSort(arr, arr.length);
    }

    /**
     * ð������
     *
     * @param arr
     * @param size
     */
    static void bubbleSort(int arr[], int size) {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
