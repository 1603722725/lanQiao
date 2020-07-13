package ���ű�������Ƶ;

/**
 * @author wl
 * @Data 2020-01-20 8:44
 * ���������������к͵����� ����
 */
public class �����������Һ͵����� {
/**
 * ��Ԫ��  a+b=sum
 *
 * @param arr
 * @param sum
 * @return
 */
public static int find2(int[]arr,int sum){
        int left=0,right=arr.length-1;
        int count=0,a=1,b=1;
        while(left<right){
        if((arr[right]+arr[left])==sum){
        count++;
        System.out.println(left+"=="+right);
        }

        while(arr[right]==arr[right-1]){
        a++;
        right--;
        }
        while(arr[left]==arr[left+1]){
        b++;
        left++;
        }
        if((arr[right]+arr[left])>sum){
        right--;
        left--;
        }
        left++;
        }
        return count+a*b-1;
        }
public static int find3(int[]arr,int sum){
        return 1;
        }
public static void f2(int[]arr,int k){
        // p Ϊ��ָ�룬 r Ϊ��ָ��
        int p=0;
        int r=arr.length-1;
        System.out.print("�ⷨ����");
        while(p<r){
        if((arr[p]+arr[r])<k){
        p++;
        }else if((arr[p]+arr[r])==k){
        System.out.print("("+arr[p]+","+arr[r]+")  ");
        p++;
        }else{
        r--;
        }
        }
        }
public static void main(String[]args){
        int[]arr={4,4,4,6,6};
        f2(arr,10);
        }
        }
