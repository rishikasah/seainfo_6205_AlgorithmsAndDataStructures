package final_exam;

/*
 *  Given the root of a binary tree, return the sum of all left leaves.
 *  A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 */

public class Question4 {

    private int sumOfLeaves = 0;

    public int leftTreeLeavesSum(TreeNode root) {
        treeTraversal(root, false);
        return sumOfLeaves;
    }

    private void treeTraversal(TreeNode root, boolean isLeftTree){
        if(root == null)
            return;

        if(root.left == null && root.right == null){

            if(isLeftTree)
                sumOfLeaves += root.val;

            return;
        }

        treeTraversal(root.left, true);
        treeTraversal(root.right, false);
    }
}
