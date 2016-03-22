package LeetCode;

/**
 * Lancer on 2016/3/21.
 */
public class No_110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        else {
            tmp_depth preDepth = new tmp_depth();
            return goDepth(root, preDepth);
        }

    }

    public boolean goDepth(TreeNode node, tmp_depth preDepth) {
        int tmp_depth = preDepth.depth;
        if (node.left == null && node.right == null) {
            preDepth.depth = 0;
            return true;
        }
        else {
            int left_depth = 0;
            int right_depth = 0;
            if (node.left != null) {
                boolean left_result = goDepth(node.left, preDepth);
                if (left_result) {
                    left_depth = preDepth.depth + 1;
                }
                else {
                    System.out.println(node.val);
                    return false;
                }
            }
            if (node.right != null) {
                preDepth.depth = tmp_depth;
                boolean right_result = goDepth(node.right, preDepth);
                if (right_result){
                    right_depth = preDepth.depth + 1;
                }
                else {
                    System.out.println(node.val);
                    return false;
                }
            }
            if (Math.abs(left_depth - right_depth) <= 1) {
                int delta = left_depth >= right_depth ? left_depth : right_depth;
                preDepth.depth = tmp_depth + delta;
                System.out.println(node.val + " -> " + preDepth.depth);
                return true;
            }
            else {
                System.out.println(node.val);
                System.out.println(left_depth + " " + right_depth);
                return false;
            }

        }
    }

    class tmp_depth {
        public int depth;

        tmp_depth(){
            depth = 0;
        }
    }

    public static void main(String[] args) {
        No_110 t = new No_110();

        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_5 = new TreeNode(5);
        TreeNode node_6 = new TreeNode(6);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(8);
        TreeNode node_9 = new TreeNode(9);
        TreeNode node_10 = new TreeNode(10);
        TreeNode node_11 = new TreeNode(11);
        TreeNode node_12 = new TreeNode(12);
        TreeNode node_13 = new TreeNode(13);
        TreeNode node_14 = new TreeNode(14);
        TreeNode node_15 = new TreeNode(15);

        node_1.left = node_2; node_1.right = node_3;
        node_2.left = node_4; node_2.right = node_5;
        node_3.left = node_6; node_3.right = node_7;
        node_4.left = node_8; node_4.right = node_9;
        node_5.left = node_10; node_5.right = node_11;
        node_6.left = node_12; node_6.right = node_13;
        node_8.left = node_14; node_8.right = node_15;

//        node_1.left = node_2;
//        node_1.right = node_3;
//        node_2.left = node_4;
//        node_2.right = node_5;
//        node_3.right = node_6;
//        node_5.left = node_7;

//        node_1 = null;

//        node_1.left = node_2;
//        node_2.left = node_3;

        boolean result = t.isBalanced(node_1);
        System.out.println(result);
    }
}
