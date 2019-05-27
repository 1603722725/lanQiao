package 决赛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author 汪磊
 * @date 2019/5/4 - 20:34
 */

class S implements Comparable<S>
{
    int l;
    int r;
    public S(int l,int r) {
        this.l=l;
        this.r=r;
    }
    @Override
    public int compareTo(S o) {
        // TODO Auto-generated method stub
        if(this.r!=o.r)
            return (int) (this.r-o.r);
        else {
            return (int) (this.l-o.l);
        }
    }
}

public class 区间移位 {
    static int N=20000;
    static S[]s=new S[10100];
    static int []vis=new int [10100];
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int now =0;
        String str=br.readLine();
        for(int i=0;i<str.length();i++) {
            now=now*10+(int)(str.charAt(i)-'0');
        }
        n=now;
        int sum=0;

        for(int i=0;i<n;i++) {
            now=0;
            str=br.readLine();
            int a = 0,b;
            for(int j=0;j<str.length();j++) {
                if(str.charAt(j)==' ') {
                    a=now;
                    now=0;
                }
                else {
                    now=now*10+(int)(str.charAt(j)-'0');
                }
            }
            b=now;
            sum+=b-a;
            s[i]=new S(a*2,b*2);
        }
        Arrays.sort(s,0,n);
        int l=0,r=N;
        while(l<=r) {
            int mid=(l+r)/2;
            //System.out.println(mid);
            if(check(mid)==true) {
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        if(l%2==0) {
            System.out.println(l/2);
        }
        else
            System.out.println(((double)(l)*1.0)/2.0);
    }
    static boolean check(int x) {
        int now=0;
        for(int i=0;i<10100;i++) {
            vis[i]=0;
        }
        while(true)
        {
            int flag=0;

            int l=0,r=n;
            while(l<=r) {
                int mid=(l+r)/2;
                if(s[mid].r+x>=now) {
                    r=mid-1;
                }
                else l=mid+1;
            }
            for(int i=l;i<n;i++) {
                if(s[i].l<=x+now&&vis[i]==0) {
                    flag=1;
                    vis[i]=1;
                    if(now<=s[i].l+x) now+=s[i].r-s[i].l;
                    else now =s[i].r+x;
                    break;
                }
            }
            if(now>=20000) return true;
            if(flag==0) return false;
        }
    }
}

