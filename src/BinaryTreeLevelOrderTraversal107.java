import java.util.*;


public class BinaryTreeLevelOrderTraversal107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        treeNodeQueue.add(root);
        int curLevelCount = 1;
        int preLevelCount = 0;
        while (!treeNodeQueue.isEmpty()) {
            TreeNode node = treeNodeQueue.remove();
            if (node != null) {
                if (preLevelCount == 0) {
                    preLevelCount = curLevelCount;
                    curLevelCount = 0;
                    result.add(null);
                }
                preLevelCount--;
                result.add(node.val);
                if (node.left != null) {
                    treeNodeQueue.add(node.left);
                    curLevelCount++;
                }
                if (node.right != null) {
                    treeNodeQueue.add(node.right);
                    curLevelCount++;
                }
            }
        }

        return popStack(addResultToStack(result));
    }

    private Stack<List<Integer>> addResultToStack(List<Integer> results) {
        Stack<List<Integer>> resultStack = new Stack<>();
        List<Integer> rowResult = new ArrayList<>();
        for (Integer result : results) {
            if (result == null && !rowResult.isEmpty()) {
                resultStack.add(rowResult);
                rowResult = new ArrayList<>();
            } else if (result != null) {
                rowResult.add(result);
            }
        }
        resultStack.add(rowResult);
        return resultStack;
    }

    private List<List<Integer>> popStack(Stack<List<Integer>> resultStack) {
        List<List<Integer>> resultList = new ArrayList<>();
        while (!resultStack.empty()) {
            List<Integer> pop = resultStack.pop();
            if (pop != null) {
                resultList.add(pop);
            }
        }
        return resultList;
    }
}
