package ���ű�������Ƶ;

/**
 * @author wl
 * @Data 2020-03-10 21:35
 */
public class ŷ������㷨��չ{
static long x;
static long y;
public static void main(String[]args)throws Exception{
        long res=solve(12,42,6);
        System.out.println(x+"   "+y);
        System.out.println(res);
        }
/*
 * ax+by=d  �Ľ�
 * */
static long gcd(long a,long b){
        if(b==0){
        x=1;
        y=0;
        return a;
        }
        long res=gcd(b,a%b);
        long x1=x;
        x=y;
        y=x1-a/b*y;
        return res;
        }
static long solve(long a,long b,long m)throws Exception{
        long d=gcd(a,b);
        if(m%d!=0)throw new Exception("�޽�");
        long n=m/d;
        x*=n;
        y*=n;
        return d;
        }
        }
