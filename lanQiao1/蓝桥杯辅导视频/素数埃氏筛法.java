package ���ű�������Ƶ;

/**
 * @author wl
 * @Data 2020-03-11 9:06
 */
public class ��������ɸ�� {
public static void main(String[]args){
        solo(100000);
        }

/**
 * ����ɸ�� ��ʱ ����ͨ������1/10
 * ���N������
 *
 * @param N
 */
static void solo(int N){
        int n=2;
        while(n/Math.log(n)<N){
        n++;
        }
        int[]arr=new int[n];
        int x=2;
        while(x<n){
        if(arr[x]!=0){
        x++;
        continue;
        }
        int k=2;
        while(k*x<n){
        arr[k*x]=-1;
        k++;
        }
        x++;
        }
        int sum=0;
        for(int i=2;i<n; i++){
        if(arr[i]==0){
        sum++;
        }
        if(sum==N){
        System.out.println(i);
        return;
        }
        }
        }
        }
