package Test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ����
 * @date 2019/4/7 - 10:26
 */
public class ����С������ {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=3.1415926;
        //����һ
        System.out.println(String.format("%.2f",a));
        //������
        DecimalFormat df=new DecimalFormat("#.000");
        System.out.println(df.format(a));
        //������
        System.out.printf("%.4f",a);
        }
        }
