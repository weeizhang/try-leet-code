import java.util.*;

import static java.lang.Math.pow;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()) {
            TreeNode node = treeNodeQueue.remove();
            if (node != null) {
                result.add(node.val);
                treeNodeQueue.add(node.left);
                treeNodeQueue.add(node.right);
            } else {
                result.add(null);
            }
        }

        return popStack(addResultToStack(result));
    }

    private Stack<List<Integer>> addResultToStack(List<Integer> result) {
        Stack<List<Integer>> resultStack = new Stack<>();
        int i = 0;
        int rowEmpty = 0;
        while (!result.isEmpty()) {
            rowEmpty = rowEmpty * 2;
            int num = (int) pow(2, i) - rowEmpty;
            List<Integer> rowResult = null;
            for (int n = 0; n < num; n++) {
                if (result.get(0) != null) {
                    if (rowResult == null) {
                        rowResult = new ArrayList<>();
                    }
                    rowResult.add(result.remove(0));
                } else {
                    result.remove(0);
                    rowEmpty++;
                }
            }
            resultStack.add(rowResult);
            i++;
        }
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
