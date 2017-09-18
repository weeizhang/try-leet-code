public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = nodeHeight(root.left);
        int rightHeight = nodeHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int nodeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = nodeHeight(node.left) + 1;
        int right = nodeHeight(node.right) + 1;
        return left > right ? left : right;
    }
}
