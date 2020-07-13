package

��ϰϵͳ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * @author ����
 * @date 2019/4/7 - 16:44
 */
public class ����Ʊ��01{
public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        String s[]=new String[n];
        String ss[][]=new String[n][];
        cin.nextLine();
        for(int i=0;i<n; i++){
        s[i]=cin.nextLine();
        ss[i]=s[i].split(" ");
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n; i++)
        for(int j=0;j<ss[i].length;j++){
        list.add(Integer.valueOf(ss[i][j]));
        }
        Collections.sort(list);
        int cw=-1,cf=-1,size=list.size(),a,b;
        for(int i=0;i<size -1;i++){
        a=list.get(i);
        if(a==list.get(i+1)){
        cf=a;
        list.remove(i);
        break;
        }
        }
        for(int i=0;i<size -1;i++){
        a=list.get(i);
        if(a+1!=list.get(i+1)){
        cw=a+1;
        break;
        }
        }
        System.out.println(cw+" "+cf);
        }
        }
