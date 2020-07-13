package

����;
import java.util.HashSet;
import java.util.Set;
/**
 * @Author: wl
 * @Date: 2019/5/14 22:08
 */
public class ���˻�{
static int a[]={1,2,3,4,5,6,7,8,9};
static int max=0;
public static void main(String[]args){
        f(0);
        System.out.println(max);
        }
public static boolean check(int t){
        Set<Integer> set=new HashSet<Integer>();
        if(t<100000000||t>1000000000)
        return false;
        while(t>0){
        int aa=t%10;
        if(aa==0)
        return false;
        set.add(aa);
        t=t/10;
        }
        if(set.size()!=9)
        return false;
        else
        return true;
        }
public static int getcj(int s){
        int A=0;
        int B=0;
        for(int i=0;i<s; i++){
        A=A*10+a[i];
        }
        for(int i=s;i<a.length;i++){
        B=B*10+a[i];
        }
        return A*B;
        }

public static void f(int k){
        if(k==a.length){
        for(int i=0;i< 4;i++){
        int tt=getcj(i);
        if(check(tt)&&tt>max)
        max=tt;
        }
//            for (int i = 0; i <a.length ; i++) {
//                System.out.print(a[i]);
//            }
//            System.out.println();
        }

        for(int i=k;i<a.length;i++){            //ȫ����
        {int x=a[i];a[i]=a[k];a[k]=x;}
        f(k+1);
        {int x=a[i];a[i]=a[k];a[k]=x;}
        }
        }
        }
