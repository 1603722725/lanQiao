package 蓝桥杯辅导视频;

import java.util.Scanner;

/**
 * @author wl
 * @Data 2020-04-17 21:09
 */
public class dfs水洼数目 {
    static int m,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        char[][] c = new char[m][n];
        for (int i = 0; i < m; i++) {
            c[i] = sc.next().toCharArray();
        }
        //System.out.println(c[0][0]);
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (c[i][j] == 'W'){
                    dfs(c,i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static void dfs(char[][] arr,int x,int y){
        arr[x][y] = '.';
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i==0 && j==0)
                    continue;
                if (x+i>=0 && x+i<=m-1 && y+j>=0 && y+j<=n-1){
                    if (arr[x+i][y+j]=='W'){
                        dfs(arr,x+i,y+j);
                    }
                }
            }
        }
    }
}
/*
        W........WW.
        .WWW.....WWW
        ....WW...WW.
        .........WW.
        .........W..
        ..W......W..
        .W.W.....WW.
        W.W.W.....W.
        .W.W......W.
        ..W.......W.
  */
