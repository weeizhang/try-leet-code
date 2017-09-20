public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if(root.left == null && root.right != null) {
            return hasPathSum(root.right, sum);
        }
        if(root.right == null && root.left != null) {
            return hasPathSum(root.left, sum);
        }
        if (sum == 0 && (root.left == null || root.right == null)) {
            return true;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
