package leetcode;

/**
 * @author wl
 * @Data 2020-06-12 17:01
 * ����������ת��Ϊ����������
 */
public class _108 {
    static int[] nums = {-10, -3, 0, 5, 9};

    public static void main(String[] args) {
        TreeNode t = helper(0, nums.length - 1);
        System.out.println(t);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode helper(int left, int right) {
        if (left > right) return null;
        // always choose left middle node as a root
        int p = (left + right) / 2;
        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

    public static TreeNode sortedArrayToBST() {
        return helper(0, nums.length - 1);
    }
}
