package ���ű�������Ƶ;


/**
 * @author wl
 * @Data 2020-04-18 8:29
 */
public class dfs���ѵĴ� {
public static void main(String[]args){
        dfs(4,7,"");
        }
static int count=0;
static void dfs(int l,int n,String prefix){
        for(char i='A';i< 'A'+l;i++){
        if(isHard(prefix,i)){
        count++;
        System.out.println(prefix+i);
        if(n==count){
        System.exit(0);
        }
        dfs(l,n,prefix+i);
        }
        }
        }
static boolean isHard(String prefix,char c){
        int count=0;
        for(int i=prefix.length()-1;i>=0;i-=2){
        String s1=prefix.substring(i,i+count+1);
        String s2=prefix.substring(i+count+1)+c;
        if(s1.equals(s2))
        return false;
        count++;
        }
        return true;
        }
        }
