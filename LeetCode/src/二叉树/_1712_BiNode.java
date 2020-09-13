package ¶þ²æÊ÷;

/**
 * @author wl
 * @Data 2020-07-28 21:18
 */
public class _1712_BiNode {
    public static void main(String[] args){

    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public TreeNode convertBiNode(TreeNode root){
        if (root == null)
            return null;
        TreeNode subRoot = convertBiNode(root.left);
        if (subRoot == null){
            subRoot = root;
        }else {
            TreeNode subRootTmp = subRoot;
            while (subRoot.right != null){
                subRoot = subRoot.right;
            }
            subRoot.right = root;
            subRoot = subRootTmp;
        }
        root.left = null;
        root.right = convertBiNode(root.right);
        return subRoot;
    }
}
