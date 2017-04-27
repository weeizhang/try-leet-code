public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        }
    }
}