class LowestCommonAncestorBinaryTree {
    /* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree. 
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        // If root of tree is null return null
        if(root==null)
            return null;
        
        // if root node is the same node as p or q return root
        if(root==p || root==q)
            return root ;
        
        TreeNode leftNode=lowestCommonAncestor(root.left,p, q); // Call with left child
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q); // Call with right child
        
        if(rightNode==null)
            return leftNode;
        else if(leftNode==null)
            return rightNode;
        else
            return root;
    }
}
