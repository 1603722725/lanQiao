package LeetCode1;

/**
 * @author wl
 * @Data 2020-07-28 19:24
 */
public class _104_二叉树最大深度 {
    public static void main(String[] args) {

    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
