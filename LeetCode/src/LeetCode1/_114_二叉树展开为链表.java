package LeetCode1;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl
 * @Data 2020-08-02 10:30
 */
public class _114_二叉树展开为链表 {
    public  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorderTraversal(root,list);
        for (int i = 1; i < list.size(); i++) {
            TreeNode prev = list.get(i-1),cur = list.get(i);
            prev.left = null;
            prev.right = cur;
        }
    }
    public void preorderTraversal(TreeNode root, List<TreeNode> list){
        if (root != null){
            list.add(root);
            preorderTraversal(root.left,list);
            preorderTraversal(root.right,list);
        }
    }
}