package

��������;

import java.util.Scanner;

public class �ƶ����� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int rm=m%w==0?m/w:(m/w+1);
        int rn=n%w==0?n/w:(n/w+1);
        int cm=0,cn=0;
        if(rm%2==0)cm=rm*w-m+1;
        else cm=w-(rm*w-m);

        if(rn%2==0)cn=rn*w-n+1;
        else cn=w-(rn*w-n);
        System.out.println(Math.abs(rm-rn)+Math.abs(cm-cn));
        }
        }
