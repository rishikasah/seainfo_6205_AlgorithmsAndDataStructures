package Week2;
//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
public class SymmetricTree {
  
  public boolean isSymmetric(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode nodeLeft, TreeNode nodeRight) {
        if (nodeLeft == null && nodeRight == null)
            return true;
        
        if (nodeLeft == null || nodeRight == null) 
            return false;
        
        if (nodeLeft.val != nodeRight.val) 
            return false;

        return isMirror(nodeLeft.left, nodeRight.right) && isMirror(nodeLeft.right, nodeRight.left);
    }
  
}
