package ����������ⵥ;

import java.util.Scanner;

/**
 * @author ����
 * @date 2019/4/12 - 19:00
 * һ������ġ������֡���Ϸ�����������к��û��µ�����
 */
public class UVA304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int ans =1;
        while(flag){
            int n=sc.nextInt();
            if (n==0){flag =false; break;}
            int a1=0,b1=0;
            int []a=new int [n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i]=sc.nextInt();
            for (int i = 0; i <n ; i++) {
                b[i]=sc.nextInt();
                if(a[i]==b[i]) a1++;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i]==b[j] && i!=j) b1++;
                }
            }
            System.out.println("Game "+ans+":");
            ans++;
            System.out.println("    ("+a1+","+(b1-a1)+")");
        }


    }
}
