package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_length = maxDepth(root.left) + 1;
        int right_length = maxDepth(root.right) + 1;
        return left_length >= right_length ? left_length : right_length;
    }
}
