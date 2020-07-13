package

��������;

import sun.net.TelnetInputStream;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wl
 * @Data 2020-05-20 8:44
 */
public class ȫ���� {
private static char[]c="lanqiao".toCharArray();
private static char[]tmp=new char[7];
private static boolean[]vis=new boolean[7];
private static int count=0;
private static Set<String> ans=new HashSet<>();
public static void main(String[]args){
        dfs(0);
        System.out.println("δȥ��"+count);
        System.out.println("ȥ�غ�"+ans.size());
        }
public static void dfs(int k){
        if(k==7){
        count++;
        ans.add(new String(tmp));
        return;
        }
        for(int i=0;i< 7;i++){
        if(!vis[i]){
        tmp[k]=c[i];
        vis[i]=true;
        dfs(k+1);
        vis[i]=false;
        }
        }
        }
        }
