package 栈和队列;
import java.util.LinkedList;
public class problem_07生成窗口最大值数组 {
   public static int [] getMaxWindow(int []arr,int w){
       if (arr==null || w<1 || arr.length<w)
           return null;
       int len = arr.length;
       int index =0;
       int res [] = new int[len-w+1];
       LinkedList<Integer> qmax = new LinkedList<Integer>();
       for (int i = 0; i < len; i++) {
           while(!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]){
               qmax.pollLast();
           }
           qmax.addLast(i);
           if(qmax.peekFirst() == i-w){
               qmax.pollFirst();
           }
           if (i>=w-1)
               res[index++] = arr[qmax.peekFirst()];
       }
       return res;
   }
   public static void printArray(int arr[]){
       for (int i = 0; i <arr.length ; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 4, 3, 3, 6, 7 };
        int w = 3;
        printArray(getMaxWindow(arr, w));
    }
}
