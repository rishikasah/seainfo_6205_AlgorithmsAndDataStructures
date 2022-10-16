package quiz1;
import java.util.ArrayList;
import java.util.List;

class BTreeLevelOrderTraversal {

    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public void BTreeHelper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

         // fulfil the current level
         levels.get(level).add(node.val);

         // process child nodes for the next level
         if (node.left != null)
            BTreeHelper(node.left, level + 1);
         if (node.right != null)
            BTreeHelper(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        BTreeHelper(root, 0);
        return levels;
    }
}
