public class Question3 {

    // O(n) - Time Complexity
    // O(h) - space complexity - h  = height
    TreeNode root;
     
    // Range specified by two variables start, end
    void treeTraversal(TreeNode node, int start, int end) {
         
        if (node == null)
            return;
 
        
    // Since tree is a BST - left node < root and right  > root 
    // node.val > start then find key in left else go right.
        if (start < node.val) {
            treeTraversal(node.left, start, end);
        }
 
        // If in range print
        if (start <= node.val && end >= node.val) {
            System.out.print(node.val + " ");
        }
 
        // call right recursively
        treeTraversal(node.right, start, end);
    }
}
