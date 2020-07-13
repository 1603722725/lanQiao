package

��������;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author wl
 * @Data 2020-06-07 9:56
 * ����һ�� n �� m �еı�����ǿ���ʹ�������ķ�ʽ������������������������ǳ���õı��Ϊһ����������
 * ���磬һ�� 4 �� 5 �е������������£�
 * 1 2 3 4 5
 * 14 15 16 17 6
 * 13 20 19 18 7
 * 12 11 10 9 8
 */
public class ���� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][]aa=matrix(m,n);
        for(int i=0;i<m; i++){
        System.out.println(Arrays.toString(aa[i]));
        }
        System.out.println(aa[a-1][b-1]);
        }
public static int[][]matrix(int m,int n){
        int[][]arr=new int[m][n];
        int i=1;
        int tr=0,tc=0,dr=m-1,dc=n-1;
        while(tr<=dr&&tc<=dc){
        if(tr==dr){
        for(int j=tc;j<=dc;j++){
        arr[tr][j]=i++;
        }
        }else if(tc==dc){
        for(int j=tr;j<=dr;j++){
        arr[j][tc]=i++;
        }
        }else{
        int curc=tc;
        int curr=tr;
        while(curc!=dc){
        arr[tr][curc]=i++;
        curc++;
        }
        while(curr!=dr){
        arr[curr][dc]=i++;
        curr++;
        }
        while(curc!=tc){
        arr[dr][curc]=i++;
        curc--;
        }
        while(curr!=tr){
        arr[curr][tc]=i++;
        curr--;
        }
        }
        tr++;
        tc++;
        dr--;
        dc--;
        }
        return arr;
        }
        }
