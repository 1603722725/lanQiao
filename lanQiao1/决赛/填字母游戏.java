package

����;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author ����
 * @date 2019/5/3 - 19:55
 * 20��
 */
public class ����ĸ��Ϸ{
public static void main(String[]args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(bf.readLine());
        for(int i=0;i<num; i++){
        String str=bf.readLine();
        System.out.println(f(str));
        }
        }

public static int f(String str){
        if(str.indexOf("LOL")!=-1)
        return-1;
        if(str.indexOf("*")==-1)
        return 0;
        int res=-1;
        char c[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
        if(c[i]=='*'){
        c[i]='L';
        res=Math.max(res,-f(new String(c)));
        if(res==1){        //����
        c[i]='*';
        return 1;
        }

        c[i]='O';
        res=Math.max(res,-f(new String(c)));
        if(res==1){
        c[i]='*';
        return 1;
        }
        c[i]='*';
        }
        }
        return res;
        }
        }
//����   100
/*
import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.Scanner;

class Main{
    static String str;
    static Map<String, Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        str=s.nextLine();
        long currentTimeMillis = System.currentTimeMillis();
        for(int i=0;i<n;i++)
        {
            str=s.nextLine();
            System.out.println(adv());//-1 -1 1   L***L***L
        }
//	System.out.println(System.currentTimeMillis()-currentTimeMillis);
    }
    private static int adv() {//Ԥ����

        int index=0;
        int a,b,len1 = 0,len2=0;
        index=str.indexOf("*L*");
        if(index>0)
        {
            String temp=str;
            str=temp.substring(0,index+2);
            for(int i=0;i<str.length();i++)
                if(str.charAt(i)=='*')
                    len1++;
            a=f();
            str=temp.substring(index+1);
            for(int i=0;i<str.length();i++)
                if(str.charAt(i)=='*')
                    len2++;
            b=f();
            str=temp;

            return u(a, b, len1, len2);

        }else
        {
            return f();
        }
    }
    private static int u(int a,int b,int len1,int len2)
    {

        if((a==1&&len1==1)||(b==1&&len2==1))
            return 1;

        if(a==1&&b==1)
            return -1;
        if(a==b)
            return a;

        if(a!=0&&b!=0)
            return 1;

        if(a==1||b==1)
            return 1;

        if(a==-1&&b==0)
            return (len2%2==0)?a:-a;

        if(a==0&&b==-1)
            return (len1%2==0)?b:-b;

        if(a==1&&b==0)
        {
            if(len1==1)return 1;
            return (len2%2==0)?a:-a;
        }

        if(len2==1) return 1;
        return (len1%2==0)?b:-b;


    }
    private static int f() {

        if(str.contains("*OL")||str.contains("L*L")||str.contains("LO*"))
            return 1;//��ֹ����
        if(!str.contains("*"))
            return 0;

        //���L****����*****L
        if((str.startsWith("L***")&&!str.substring(1).contains("O")&&!str.substring(1).contains("L"))
                ||
                (str.endsWith("***L")&&!str.substring(0,str.length()-1).contains("O")&&!str.substring(0,str.length()-1).contains("L")))
            return (str.length()%2==0)?1:-1;

        List<Integer> indexs=index(str);//����*���±�����

        int [] result=new int[indexs.size()*2];
        int k=0;
        for(int i=0;i<indexs.size();i++)
        {
            //��
            str=rep(str, indexs.get(i), 'L');

            if(map.containsKey(tri(str))){
                result[k++]=map.get(tri(str));
            }else{
                map.put(tri(str),result[k++]=f());
            }

            if(result[k]==-1)
            {
                str=rep(str, indexs.get(i), '*');
                return 1;
            }


            str=rep(str, indexs.get(i), 'O');

            if(map.containsKey(tri(str))){
                result[k++]=map.get(tri(str));
            }else{
                map.put(tri(str),result[k++]=f());
            }

            if(k<result.length&&result[k]==-1)
            {
                str=rep(str, indexs.get(i), '*');
                return 1;
            }

            str=rep(str, indexs.get(i), '*');
        }

        return vote(result);

    }

    private static String tri(String str)
    {
        int start=str.indexOf('*');
        int end=str.lastIndexOf('*');
        if(start-2<0) start=2;
        if(end+3>=str.length()) end=str.length()-3;
        str=str.substring(start-2,end+3);

        if(str.startsWith("OL*")||str.startsWith("OO*")||str.startsWith("LL*"))
            str=str.substring(1);
        if(str.endsWith("*LO ")||str.endsWith("*OO")||str.endsWith("*LL"))
            str=str.substring(0,str.length()-1);
        return str;
    }

    //replace����
    private static String rep(String str,int index,char a)
    {
        return str.substring(0,index)+a+str.substring(index+1);
    }

    //vote����(ȫΪ1����-1,��һ��-1����1)
    private static int vote(int []a)
    {
        int min=1;
        for(int i=0;i<a.length;i++)
        {
            min=min<a[i]?min:a[i];
        }
        return 0-min;
    }

    //����*�±�����
    private static List index(String nextLine) {
        List<Integer> list=new ArrayList<Integer>();
        int qian=0;
        while(nextLine.contains("*"))
        {
            int index=nextLine.indexOf("*");
            list.add(qian+index);
            nextLine=nextLine.substring(index+1);
            qian+=index+1;
        }
        return list;
    }
}*/
