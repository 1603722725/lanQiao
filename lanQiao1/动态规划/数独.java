package

��̬�滮;

import java.util.Scanner;

public class ���� {
//����
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char arr[][]=new char[9][9];
        for(int i=0;i< 9;i++){
        String str=sc.nextLine();
        arr[i]=str.toCharArray();
        }
        dfs(arr,0,0);
        }

public static void dfs(char table[][],int x,int y){
        if(x==9){
        print(table);
        System.exit(0);
        }
        if(table[x][y]=='0'){
        for(int i=1;i< 10;i++){
        if(check(table,x,y,i)){
        table[x][y]=(char)('0'+i);
        dfs(table,x+(y+1)/9,(y+1)%9);
        }
        }
        table[x][y]='0';
        }else{
        dfs(table,x+(y+1)/9,(y+1)%9);
        }

        }
public static void print(char table[][]){
        for(int j=0;j< 9;j++){
        System.out.println(new String(table[j]));
        }

        }

public static boolean check(char table[][],int i,int j,int k){
        //���ͬ�к�ͬ��
        for(int k2=0;k2< 9;k2++){
        if(table[i][k2]==(char)('0'+k))return false;
        if(table[k2][j]==(char)('0'+k))return false;
        }
        //���С�Ź���
        for(int l=(i/3)*3;l< (i/3+1)*3;l++){
        for(int m=(i/3)*3;m< (i/3+1)*3;m++){
        if(table[l][m]==(char)('0'+k))return false;
        }
        }
        return true;
        }
        }
