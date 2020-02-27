package leetcode;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-02-17 17:11
 */
public class Test {
   /* 1.输入一个五位数，输出每一位上面的数字。（注意验证，如果输入的数字不是五位数，给予提示）
            2.判断输入的年份是否为闰年。满足下列条件之一，均为闰年：
    a)能被4整除，并且不能被100整除
    b)能被400整除
3.使用for循环打印
0
        5
        10
        15
        ...
        95
        100
        4.使用for循环计算1到100之间所有能被3整除的数的和
5.打印100~999中所有的水仙花数: (水仙花数就是 该数等于每一位数的立法和  153=1的三次方+5的三次方+3的三次方)
            6.编程求1！+2！+3！+..5!的值
7.定义一个整型数组，并求出数组中所有元素的和，数组中最大的元素和数组中最小的元素，并输出。
            8.有一个数组：8，4，2，1，23，344，12
            1）循环输出数列的值
 2）求数列中所有数值的和
 3）使用冒泡排序为数组进行排序并输出排序后的结果
*/
   public static void main(String[] args) {
//       print(12345);
//       boolean result = isLeapYear(2022);
//       System.out.println(result);
//       print1();
//       sumThree();
//       numberFlower();
//       print2();
       int[] arr = {10,2,3,4,5,1};
       print3(arr);
   }

    /**
     * 1.输入一个五位数，输出每一位上面的数字。（注意验证，如果输入的数字不是五位数，给予提示）
     * @param num
     */
   static void print(int num){
       int len = String.valueOf(num).length();
       if (len == 5){
           int i=5;
           while (i>0){
               System.out.println(num%10);
               num/=10;
               i--;
           }
       }else {
           System.out.println("非法输入！！！");
       }
   }

    /**
     * 2.判断输入的年份是否为闰年。满足下列条件之一，均为闰年：
     *     a)能被4整除，并且不能被100整除
     *     b)能被400整除
     * @param year
     * @return
     */
    static boolean isLeapYear(int year){
       if (year%4==0 && year%100!=0 || year %400==0){
           return true;
       }
       return false;
    }

    /**
     * 3.使用for循环打印
     */
    static void print1(){
        for (int i = 0; i <=100 ; i+=5) {
            System.out.println(i);
        }
    }

    /**
     * 4.使用for循环计算1到100之间所有能被3整除的数的和
     * @return
     */
    static int sumThree(){
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }

    /**
     * 5.打印100~999中所有的水仙花数: (水仙花数就是 该数等于每一位数的立法和  153=1的三次方+5的三次方+3的三次方)
     */
    static void numberFlower(){
        for (int i =153; i <=999 ; i++) {
            int a = i / 100;
            int b = (i-a*100) / 10;
            int c = i % 10;
            if(i == a*a*a + b*b*b + c*c*c)
                System.out.println(i);
        }
    }

    /**
     * 6.编程求1！+2！+3！+..5!的值
     */
    static void print2(){
        int sum = 0;
        for (int i = 1; i <=5; i++) {
            int a=1;
            for (int j = i; j >=1 ; j--) {
                a*=j;
            }
            System.out.println(a);
            sum+=a;
        }
        System.out.println(sum);
    }

    /**
     * 7.定义一个整型数组，并求出数组中所有元素的和，数组中最大的元素和数组中最小的元素，并输出。
     * @param arr
     */
    static void print3(int[] arr){
        int sum = 0;
        int max = 0,min = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
//        Arrays.sort(arr);
//        max = arr[arr.length-1];
//        min = arr[0];
        bubbleSort(arr,arr.length);
        max = arr[arr.length-1];
        min = arr[0];
        System.out.println(max+"   "+min);
    }
    /**
     * 8.有一个数组：8，4，2，1，23，344，12
     *  1）循环输出数列的值
     *  2）求数列中所有数值的和
     *  3）使用冒泡排序为数组进行排序并输出排序后的结果
     */
    static void print4(){
        int[] arr = {8,4,2,1,23,344,12};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);
        bubbleSort(arr,arr.length);
    }

    /**
     * 冒泡排序
     * @param arr
     * @param size
     */
    static void bubbleSort(int arr[],int size){
        for (int i = size-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
