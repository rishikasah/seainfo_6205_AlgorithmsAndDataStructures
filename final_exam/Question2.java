package final_exam;

/*
 * For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.
 * A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.
 * Given the roots of two binary trees root1 and root2, return true if the two trees are flip equivalent or false otherwise.
 *
 * Input: root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 = [1,3,2,null,6,4,5,null,null,null,null,8,7]
 * Output: true
 * Explanation: We flipped at nodes with values 1, 3, and 5.
 */

public class Question2 {

    public boolean areTwoTreesFlipEquivalent(TreeNode root1, TreeNode root2) {

        // leaves encountered
        if(root1==null && root2==null)
            return true;

        // Tree has extra nodes
        if(root1==null || root2==null)
            return false;

        // validate nodes to have same values
        if(root1.val!=root2.val)
            return false;

        // Recurse  on left and right subtree validating matches for the left and right matches for both or left and right matches
        return( areTwoTreesFlipEquivalent(root1.right,root2.right) &&  areTwoTreesFlipEquivalent(root1.left, root2.left)
                ||
                areTwoTreesFlipEquivalent(root1.left,root2.right) &&  areTwoTreesFlipEquivalent(root1.right,root2.left));

    }
}
