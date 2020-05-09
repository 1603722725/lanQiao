package leetcode;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;
import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import javax.swing.tree.TreeNode;
import java.util.*;

/*
*
 * @author wl
 * @Data 2020-04-09 18:41
 * leetcode  剑指offer
*/
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Demo02 {
    public static void main(String[] args) {

    }
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        int res = -1;
        for (int i = 0; i <nums.length ; i++) {
            if (set.contains(nums[i])){
                res = nums[i];
                break;
            }else {
                set.add(nums[i]);
            }
        }
        return res;
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
       if (matrix==null || matrix.length==0 || matrix[0].length==0){
           return false;
       }
       int row = 0;
       int col = matrix[0].length-1;
       while (row < matrix.length && col >= 0){
           if (matrix[row][col]>target){
               col--;
           }else if(matrix[row][col]==target){
               return true;
           }else {
               row++;
           }
       }
       return false;
    }
    public String replaceSpace(String s) {
        char[] c = s.toCharArray();
        String str = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i]==' '){
                str+="%20";
            }else {
                str+=c[i];
            }
        }
        return str;
    }
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> list = new Stack<>();
        ListNode temp = head;
        while (temp!=null){
            list.push(temp);
            temp = temp.next;
        }
        int size = list.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = list.pop().val;
        }
        return print;
    }

    /**
     * 重建二叉树   已知前序  中序
     * @param preorder
     * @param inorder
     * @return
     */
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//
//    }
}
