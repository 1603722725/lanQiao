package ����;

/**
 * @Author: wl
 * @Date: 2019/5/14  21:34
 */
public class ��������� {
public static void main(String[]args){
        double x1=2.3;
        double x2=6.4;
        double x3=5.1;
        double y1=2.5;
        double y2=3.1;
        double y3=7.2;
        double a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double b=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double c=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double p=(a+b+c)/2;
        double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("%.3f",s);
        }
        }
