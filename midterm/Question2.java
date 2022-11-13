public class Question2 {

    // O(n)
    public void printParent(TreeNode node){
        if (node == null)
            return;
        else
        {
            if(node.left != null || node.right != null)
                System.out.println(node.val);
            // Recursive calls for the children of the current node Current node is now the new parent
            printParent(node.left);
            printParent(node.right);
        }
    }
}
