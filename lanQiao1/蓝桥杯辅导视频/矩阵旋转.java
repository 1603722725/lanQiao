//package 蓝桥杯辅导视频;
///**
// * @author 汪磊
// * @date 2019/5/11 - 22:52
// * 矩阵顺时针旋转90度
// */
//public class 矩阵旋转 {
//    public static void rotate(int [][]matrix){
//        int tR = 0;
//        int tC = 0;
//        int dR = matrix.length-1;
//        int dC = matrix[0].length-1;
//        while(tR < dR){
//            rotateEdge(matrix,tR++,tC++,dR--,dC--);
//        }
//    }
//
//    public static void rotateEdge(int [][]m,int tR,int tC,int dR,int dC){
//        int times = dC - tC;     //times 是总的组数  列数减1
//        int tmp = 0;
//        for (int i = 0; i <times ; i++) {
//            tmp = m[tR][tC+i];
//            m[tR][tC+i] = m[dR-i][tC];
//            m[dR-i][tC] = m[dR][dC-i];
//            m[dR][dC-i] = m[tR+i][dC];
//            m[tR+i][dC] = tmp;
//        }
//    }
//    public static void main(String[] args) {
//        int matrix [][] = {
//                {1,2,3,4},
//                {5,6,7,8}
////                {9,0,2,3}
////                {3,4,5,6}
//        };
//        rotate(matrix);
//        for (int i = 0; i <matrix.length ; i++) {
//            for (int j = 0; j <matrix[0].length ; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
