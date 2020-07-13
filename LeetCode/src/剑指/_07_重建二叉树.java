package 剑指;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-06-27 19:05
 */
public class _07_重建二叉树 {
    static int[] preorder;
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < preorder.length; i++) {
            map.put(preorder[i], i);
        }
        return recursive(0, 0, inorder.length - 1);
    }

    public static TreeNode recursive(int pre_root_idx, int in_left_idx, int in_right_idx) {
        if (in_left_idx > in_right_idx) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pre_root_idx]);
        int idx = map.get(preorder[pre_root_idx]);
        root.left = recursive(pre_root_idx + 1, in_left_idx, idx - 1);
        root.right = recursive(pre_root_idx + (idx - 1 - in_left_idx + 1) + 1, idx + 1, in_right_idx);
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
