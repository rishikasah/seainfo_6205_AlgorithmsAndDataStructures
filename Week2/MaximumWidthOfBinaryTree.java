public class MaximumWidthOfBinaryTree {
    /*
    * Given the root of a binary tree, return the maximum width of the given tree.
    * The maximum width of a tree is the maximum width among all levels.
    * The width of one level is defined as the length between the end-nodes (the leftmost and    rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.
    * It is guaranteed that the answer will in the range of a 32-bit signed integer.
    */
    List<Integer> startLevel = new ArrayList<>();
    int result = 0;

    public int widthOfBinaryTree(TreeNode root) {
    
        traverseTree(root,1,0);
        return result;
    }

    public void traverseTree(TreeNode root,int val,int height){
      
      if(root == null) 
        return;
        
      if(startLevel.size() == height)
        startLevel.add(val);
        
      result = Math.max(result,val - startLevel.get(height) + 1);
        
      traverseTree(root.left, val*2, height+1);
      traverseTree(root.right, val*2 + 1, height+1);
    }
}
