package com.zzti.lanQiao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 汪磊
 * @date 2019/4/7 - 10:26
 */
public class 保留小数点数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=3.1415926;
        //方法一
        System.out.println(String.format("%.2f",a));
        //方法二
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(a));
        //方法三
        System.out.printf("%.4f",a);
    }
}
