package Week4;

/*
 * Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST.
 * If the given node has no in-order successor in the tree, return null.
 * The successor of a node p is the node with the smallest key greater than p.val.
 */
public class Question7 {

    TreeNode resultNode = null;
    int max_val = Integer.MAX_VALUE;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p){

        if(root != null){
            if(root.val > p.val){
                if(root.val - p.val < max_val){
                    resultNode = root;
                    max_val = root.val - p.val;
                }
                inorderSuccessor(root.left, p);
            }
            else
                inorderSuccessor(root.right, p);
        }
        return resultNode;
    }
}
