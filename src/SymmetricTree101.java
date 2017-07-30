public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return nodeIsEqual(root.left, root.right);
    }

    private boolean nodeIsEqual(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val == right.val) {
            return nodeIsEqual(left.right, right.left) && nodeIsEqual(left.left, right.right);
        } else {
            return false;
        }
    }
}
