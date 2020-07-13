package

���ű�;
import java.util.Scanner;

public class ����ʽ��ȫ���� {
static int a[]={1,2,3,4,5,6,7,8,9};
static int ans=0;
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        f1(0);
        System.out.println(ans);
        }

private static boolean check(){
        int x=a[3]*100+a[4]*10+a[5];
        int y=a[6]*100+a[7]*10+a[8];
        if((a[1]*y+a[2]*x)%(a[2]*y)==0&&a[0]+(a[1]*y+a[2]*x)/(a[2]*y)==10)
        return true;
        return false;
        }

private static void f1(int k){
        if(k==9)
        if(check())
        ans++;
        for(int i=k;i< 9;i++){ //ȫ����
        {int t=a[i];a[i]=a[k];a[k]=t;}
        f1(k+1);
        {int t=a[i];a[i]=a[k];a[k]=t;}
        }
        }

        }
