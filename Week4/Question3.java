package Week4;

/*
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * A valid BST is defined as follows:
       * The left subtree of a node contains only nodes with keys less than the node's key.
       * The right subtree of a node contains only nodes with keys greater than the node's key.
       * Both the left and right subtrees must also be binary search trees.
 */
public class Question3 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }

    private boolean isValidBST(TreeNode root, Integer max, Integer min){
        if(root==null)
            return true;

        if(max != null && root.val >= max)
            return false;
        if(min != null && root.val <= min)
            return false;

        return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
    }
}
