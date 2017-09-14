public class ConvertSortedArrayToBinarySearchTree108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return bst(nums, 0, nums.length - 1);
    }

    private TreeNode bst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);

        treeNode.left = bst(nums, start, mid - 1);
        treeNode.right = bst(nums, mid + 1, end);

        return treeNode;
    }

}
