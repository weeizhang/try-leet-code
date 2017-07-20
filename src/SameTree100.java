public class SameTree100 {
    public boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null || treeNode2 == null) {
            return treeNode1 == treeNode2;
        }
        if (treeNode1.val == treeNode2.val) {
            return isSameTree(treeNode1.left, treeNode2.left) && isSameTree(treeNode1.right, treeNode2.right);
        } else {
            return false;
        }
    }
}
