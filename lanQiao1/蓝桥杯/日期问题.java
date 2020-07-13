package

���ű�;
import java.util.Arrays;
import java.util.Scanner;

public class �������� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=Integer.parseInt(s.substring(0,2));
        int b=Integer.parseInt(s.substring(3,5));
        int c=Integer.parseInt(s.substring(6,8));
        int z[]=new int[6];
        z[0]=(1900+a)*10000+b*100+c;
        z[1]=(1900+c)*10000+a*100+b;
        z[2]=(1900+c)*10000+b*100+a;
        z[3]=(2000+a)*10000+b*100+c;
        z[4]=(2000+c)*10000+a*100+b;
        z[5]=(2000+c)*10000+b*100+a;
        Arrays.sort(z);
        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<z.length;i++){
        int year=z[i]/10000;
        int m=z[i]%10000/100;
        int day=z[i]%100;
        if(year>2059||year<1960)
        continue;
        if(m<1||m>12)
        continue;
        if(leap(year))
        month[1]=29;
        else
        month[1]=28;
        if(day<1||day>month[m-1])continue;
        StringBuilder str=new StringBuilder(z[i]+"");
        str.insert(4,"-");
        str.insert(7,"-");
        System.out.println(str);
        }
        }

public static boolean leap(int n){
        if((n%4==0&&n%100!=0)||n%400==0)
        return true;
        return false;
        }
        }