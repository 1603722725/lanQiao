package

��ϰϵͳ;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author ����
 * @date 2019/4/7 - 15:47
 * �д�
 */
public class ����Ʊ�� {
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str[]=new String[n];
        String s[][]=new String[n][];
        int ans=0,c=0;
        int b[]=new int[n];
        for(int i=0;i<n; i++){
        str[i]=sc.nextLine();
        str[i]=str[i].trim();
        s[i]=str[i].split(" ");
        b[c]=s[i].length;
        ans+=b[c];
        c++;
        }
        int a[]=new int[ans];
        int q=0,aa=0;
        for(int i=0;i<n; i++){
        int ss=b[aa];aa++;
        for(int j=0;j<ss; j++){
        a[q]=Integer.parseInt(s[i][j]);
        q++;
        }
        }
        Arrays.sort(a);
        int nn=a[0];
        int nnn=0;
        for(int i=1;i<ans; i++){
        nn+=1;
        if(a[i]!=nn){
        System.out.print(a[i]-1+" ");
        nnn=i;
        break;
        }
        }
        nn=a[nnn];
        for(int i=nnn+1;i<ans-1;i++){
        nn+=1;
        if(a[i]!=nn){
        System.out.println(a[i]);
        break;
        }
        }
        }
        }
