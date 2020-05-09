package 蓝桥杯辅导视频;
import java.util.Scanner;
/**
 * @author wl
 * @Data 2020-04-17 16:30
 */
public class dfs数独 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] table = new char[9][9];
        for (int i = 0; i <9 ; i++) {
            table[i] = sc.nextLine().toCharArray();
        }
        dfs(table,0,0);
    }
    public static void dfs(char[][] table,int x,int y){
        if (x==9){
            print(table);
            System.exit(0);
        }
        if (table[x][y]=='0'){
            for (int i = 1; i < 10; i++) {
                if (check(table,x,y,i)){
                    table[x][y] = (char)('0'+i);
                    dfs(table,x+(y+1)/9,(y+1)%9);
                }
            }
            table[x][y] = '0';   //回溯
        }else {
            dfs(table,x+(y+1)/9,(y+1)%9);
        }
    }
    public static void print(char[][] table){
        for (int i = 0; i < table.length; i++) {
            System.out.println(new String(table[i]));
        }
    }
    public static boolean check(char[][] table,int x,int y,int k){
        for (int i = 0; i <9 ; i++) {
            if (table[x][i]==(char)('0'+k)) return false;
            if (table[i][y]==(char)('0'+k)) return false;
        }
        for (int i = (x/3)*3; i < (x/3+1)*3; i++) {
            for (int j = (y/3)*3; j < (y/3+1)*3; j++) {
                if (table[i][j]==(char)('0'+k))
                    return false;
            }
        }
        return true;
    }
}
