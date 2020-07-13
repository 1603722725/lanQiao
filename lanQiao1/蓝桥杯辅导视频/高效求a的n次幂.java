package ���ű�������Ƶ;

/**
 * @author ����
 * @date 2019/4/26 - 16:51
 */
public class ��Ч��a��n���� {
public static int pow(int a,int n){
        if(n==0)return 1;
        int res=a;
        int ex=1;
        while((ex<<1)<=n){
        res=res*res;
        ex=ex<<1;
        }
        return res*pow(a,n-ex);
        }

public static void main(String[]args){
        int n=pow(2,10);
        System.out.println(n);
        System.out.println(pow(2,11));
        }
        }
