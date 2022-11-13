public class Question2 {

    
    public void printParent(TreeNode node){
        if (node == null)
            return;
        else
        {
            System.out.println(node.val);
            // Recursive calls for the children of the current node Current node is now the new parent
            printParent(node.left);
            printParent(node.right);
        }
    }
}
