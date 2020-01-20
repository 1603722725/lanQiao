package project;

import java.util.Scanner;

public class project02 {
    //¸ßÉ®¶··¨
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String[] arrayA = A.split(" ");
        int[] B = new int[arrayA.length - 1];
        for(int i = 1;i < arrayA.length;i++)
            B[i - 1] = Integer.valueOf(arrayA[i]) - Integer.valueOf(arrayA[i - 1]) - 1;
        int sum = 0;
        for(int i = 0;i < B.length;i = i + 2)
            sum ^= B[i];
        if(sum == 0)
            System.out.println("-1");
        else {
            for(int i = 0;i < arrayA.length - 1;i++) {
                for(int j = 1;j + Integer.valueOf(arrayA[i]) < Integer.valueOf(arrayA[i + 1]);j++) {
                    B[i] -= j;
                    if(i != 0)
                        B[i - 1] += j;
                    sum = 0;
                    for(int k = 0;k < B.length;k = k + 2)
                        sum ^= B[k];
                    if(sum == 0) {
                        System.out.println(arrayA[i]+" "+(Integer.valueOf(arrayA[i])+j));
                        return;
                    }
                    B[i] += j;
                    if(i != 0)
                        B[i - 1] -= j;
                }
            }
        }
    }
}