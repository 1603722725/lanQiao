package

���ű�;

import java.util.Scanner;

public class ��ӡʮ���� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[2+2*n][2+2*n];

        shizi(a,1);
        for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
        if(a[i][j]==1)
        System.out.println("#");
        else
        System.out.println(".");
        }
        }
        }
private static void shizi(int a[][],int n){
        a[0][0]=a[1][0]=a[2][0]=a[0][1]=a[0][2]=1;
        for(int i=1;i<=n;i++){
        int x=1+2*i,y=2*i,z=2+2*i;
        for(int j=0;j<=x;j++){
        a[z][j]=1;
        }
        for(int j=2*i;j<=x;j++){
        a[j][y]=1;
        }
        for(int j=2*i;j<=z;j++){
        a[y][j]=1;
        }
        for(int j=0;j<=x;j++){
        a[y][j]=1;
        }
        }
        }
        }
