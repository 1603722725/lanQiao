package

������;
import java.util.Scanner;

public class ��λ���� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]str=new int[n];
        int[]index=new int[n];
        int[][]arr=new int[n][105];
        int p=1,len=1,sum=0;
        for(int i=0;i<str.length;i++){
        str[i]=sc.nextInt();
        str[i]=str[i]*10;
        sum+=str[i];
        }
        for(int i=0;i<sum; i++){
        for(int j=0;j<n; j++){

        if(index[j]<str[j]){
        if(judge(index,str)==1){
        p++;
        p-=len;
        len=0;
        }
        arr[j][i]=p;
        p++;
        index[j]++;
        }
        }
        }

        for(int j=0;j<arr.length;j++){
        System.out.println("#"+(j+1));
        for(int j2=0;j2<str[j];j2++){
        System.out.print(arr[j][j2]);
        if((j2+1)%10!=0){
        System.out.print(" ");
        }else{
        System.out.println();
        }
        }
        }
        }
public static int judge(int[]index,int[]str){
        int j=0;
        for(int i=0;i<str.length;i++){
        if(index[i]!=str[i]){
        j++;
        }
        }
        return j;
        }
        }
