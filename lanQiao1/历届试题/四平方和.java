package

��������;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ��ƽ���� {
static int n;
static Map<Integer, Integer> map=new HashMap<Integer, Integer>();//jdk1.6
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a,b,c,d;
        for(c=0;c*c<=n/2;c++){
        for(d=c;c*c+d*d<=n;d++){
        if(map.get(c*c+d*d)==null)
        map.put(c*c+d*d,c);
        }
        }

        for(a=0;a*a<=n/4;a++){
        for(b=a;a*a+b*b<=n/2;b++){
        if(map.get(n-a*a-b*b)!=null){
        c=map.get(n-a*a-b*b);
        d=(int)Math.sqrt(n-a*a-b*b-c*c);
        System.out.println(a+" "+b+" "+c+" "+d);
        return;
        }
        }
        }
        }
        }
