package ¾öÈü;
/**
 * @Author: wl
 * @Date: 2019/5/24 5:59
 *
 * 9 6 5 2 16
 */
public class Áù½Ç»Ã·½dfs{
    static int table[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
    public static void main(String[] args) {
        int arr[]=new int[17];
        boolean step[] = new boolean[20];
        step[13] = step[15] = true;
        dfs(arr,0,step);
    }
    public static void dfs(int arr[],int k,boolean step[]){
        if(k==5){
           if (28+arr[0] !=arr[1]+arr[2]+arr[3]+arr[4]) return;
        }
        if (k==6){
            if (28+arr[0] !=15+arr[1]+arr[5]) return;
        }
        if (k==10){
            if (28+arr[0] !=arr[5]+arr[6]+arr[7]+arr[8]+arr[9]) return;
            if (28+arr[0] !=arr[0]+arr[4]+arr[9]) return;
        }
        if (k==11){
            if (28+arr[0] !=13+arr[2]+arr[6]+arr[10]) return;
        }
        if (k==14){
            if (28+arr[0] != arr[10]+arr[11]+arr[12]+arr[13]) return;
            if (28+arr[0] != 13+arr[3]+arr[8]+arr[13]) return;
        }
        if (k==15){
            if (28+arr[0] != arr[5]+arr[10]+arr[14]) return;
            if (28+arr[0] != arr[0]+arr[3]+arr[7]+arr[11]+arr[14]) return;
        }
        if (k==17){
            if (28+arr[0] != arr[14]+arr[15]+arr[16]) return;
            if (28+arr[0] != arr[9]+arr[13]+arr[16]) return;
            if (28+arr[0] != 15+arr[2]+arr[7]+arr[12]+arr[16]) return;
            outprint(arr);
        }
        for (int i=0;i<table.length;i++) {
                if (step[table[i]]==false) {
                    step[table[i]]=true;
                    arr[k] = table[i];
                    dfs(arr,k+1,step);
                    step[table[i]]=false;
                }
            }
        }
        public static void outprint(int arr[]){
            for (int i = 5; i <10 ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
}

