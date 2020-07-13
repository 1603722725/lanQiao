package

���ű�������Ƶ;

import java.util.Arrays;

/**
 * @author wl
 * @Data 2020-02-10 20:17
 */
public class ��0���ڵ��������� {
public static void main(String[]args){
        int arr[][]={{1,2,3,4},
        {5,6,0,8},
        {0,10,11,12}};
        solve(arr);
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]);
        }
        System.out.println();
        }
        }
static void solve(int[][]matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        int rowRecord[]=new int[m];
        int colRecord[]=new int[n];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++){
        if(matrix[i][j]==0){
        rowRecord[i]=1;
        colRecord[j]=1;
        }
        }
        for(int row=0;row<m;row++){
        for(int col=0;col<n;col++){
        if(rowRecord[row]==1||colRecord[col]==1){
        matrix[row][col]=0;
        }
        }
        }
        }
        }
