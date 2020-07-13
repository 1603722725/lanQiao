package

���ű�������Ƶ;

import com.sun.rowset.internal.Row;

/**
 * @author wl
 * @Data 2020-02-10 21:35
 */
public class Z���δ�ӡ���� {
public static void main(String[]args){
        int arr[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}};
        print(arr);
        }
static void print(int[][]matrix){
        int r=0,m=matrix.length;
        int c=0,n=matrix[0].length;
        boolean l2r=true;
        while(r<m &&c<n){
        //����
        if(l2r){
        System.out.print(matrix[r][c]+" ");
        if(r==0&&c<n-1){
        l2r=!l2r;
        c++;
//                    continue;
        }else if(r>0&&c==n-1){
        l2r=!l2r;
        r++;
//                    continue;
        }else{
        c++;
        r--;
        }
        }else{
        System.out.print(matrix[r][c]+" ");
        if(c==0&&r<m-1){
        l2r=!l2r;
        r++;
//                    continue;
        }else if(r==m-1){
        l2r=!l2r;
        c++;
//                    continue;
        }else{
        r++;
        c--;
        }
        }
        }
        }
        }
