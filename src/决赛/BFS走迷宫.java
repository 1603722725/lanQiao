package ¾öÈü;
import java.util.ArrayList;
import java.util.Scanner;
public class BFS×ßÃÔ¹¬{
    public static int move [][  ] = {{-1,0},{1,0},{0,-1},{0,1}};
    public static String onepath[] = {"U","D","L","R"};
    public static class point{
        int x;
        int y;
        int step;
        String path;
        public point(int x, int y, int step, String path){
            this.x = x;
            this.y = y;
            this.step = step;
            this.path = path;
        }
    }

    public static boolean check(int [][]matrix,point a){
        int m=matrix.length-1,n=matrix[0].length-1;
        if(a.x<1 || a.x>m || a.y<1 || a.y>n || matrix[a.x][a.y]==1)
            return false;
        return true;
    }

    public static int [][] getMatrix(String []A,int m){
        int matrix[][] = new int [A.length+1][m+1];
        for (int i = 0; i <A.length ; i++) {
            char [] arrayA = A[i].toCharArray();
            for (int j = 0; j <m ; j++){
                matrix[i+1][j+1] = arrayA[j]-'0';
            }
        }
        return matrix;
    }

    //×ÖµäĞòÅĞ¶Ï
    public static boolean judge(String A,String B){
        char [] arrayA = A.toCharArray();
        char [] arrayB = B.toCharArray();
        for (int i = 0; i<A.length(); i++)
            if (arrayA[i] < arrayB[i])
                return false;
            return true;
    }

    public static void bfs(String[] A, int m){
        int matrix[][] = getMatrix(A,m);
        ArrayList<point> list = new ArrayList<>();
        list.add(new point(1,1,0,""));
        int minstep = Integer.MAX_VALUE;
        String minpath = "";
        while (list.size()!=0){
            point begin = list.get(0);
            list.remove(0);
            if(begin.x == matrix.length-1 && begin.y == matrix[0].length-1){
                if (minstep>begin.step){
                    minstep = begin.step;
                    minpath = begin.path;
                }else if(minpath == begin.path){
                    if(judge(minpath,begin.path))
                        minpath = begin.path;
                }
                continue;
            }

            for (int i = 0; i <4 ; i++) {
                int x = begin.x+move[i][0];
                int y = begin.y+move[i][1];
                int step = begin.step +1;
                String path = begin.path+onepath[i];
                point temp = new point(x,y,step,path);
                if(check(matrix,temp)){
                    list.add(temp);
                    matrix[x][y] = 1;
                }
            }
        }
        System.out.println(minstep+"\n"+minpath);
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        String A [] = new String[m];
        for (int i = 0; i < m; i++) {
            A[i] = sc.nextLine();
        }
        bfs(A,n);
    }
}