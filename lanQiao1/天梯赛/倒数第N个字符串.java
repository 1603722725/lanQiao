package

������;
import java.util.Scanner;

public class ������N���ַ��� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char[]a=new char[6];
        int l;
        long n,m=1;
        l=sc.nextInt();
        n=sc.nextLong();
        for(int i=0;i<l; i++){
        m*=26;
        }
        n=m-n;
        while(l>0){
        l--;
        a[l]=(char)('a'+(n%26));
        n=n/26;

        }
        System.out.println(a);
        }
        }
