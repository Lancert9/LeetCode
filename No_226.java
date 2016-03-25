package LeetCode;

import sun.reflect.generics.tree.Tree;

/**
 * Lancer on 2016/3/25.
 */
public class No_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
