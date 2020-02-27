package ¿∂«≈±≠∏®µº ”∆µ;
/**
 * @author ÕÙ¿⁄
 * @date 2019/4/25 - 17:48
 */
public class ª∑–Œæÿ’Û¥Ú”° {
    static int m[][]={
            {1,2,3,4},
            {5,6,7,8},
            {8,7,6,5},
//            {2,1,3,9},
//            {1,2,4,3}
    };

    public static void main(String[] args) {
        spiralOrderPrint(m);
    }
    public static void spiralOrderPrint(int [][] matrix){
        int tR = 0;
        int tC = 0;
        int dR = matrix.length-1;
        int dC = matrix[0].length-1;
        while (tR<=dR && tC <=dC){
            printEdge(m,tR++,tC++,dR--,dC--);
        }
    }
    public static void printEdge(int [][]m,int tR,int tC,int dR,int dC){
        if (tR == dR){
            for (int i = tC; i<=dC; i++) {
                System.out.print(m[tR][i]+" ");
            }
        }else if(tC == dC){
            for (int i = tR; i <=dR;i++) {
                System.out.print(m[i][tC]+" ");
            }
        }else {
            int curC = tC;
            int curR = tR;
            while (curC != dC){
                System.out.print(m[tR][curC]+" ");
                curC++;
            }

            while (curR != dR){
                System.out.print(m[curR][dC]+" ");
                curR++;
            }

            while (curC != tC){
                System.out.print(m[dR][curC]+" ");
                curC--;
            }

            while (curR != tR){
                System.out.print(m[curR][tC]+" ");
                curR--;
            }
        }
    }
}
