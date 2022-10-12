class FindLeavesOfBinaryTree {
  
  // Given a binary tree, collect a tree's nodes as if you were doing this: Collect  all the leaf nodes, Remove all leaf nodes, repeat until the tree is empty.
    public List<List<Integer>> findLeaves(TreeNode root) {
        
      List<List<Integer>> result = new ArrayList<>();
      DFS(result, root);
      return result;
    }
    
    private int DFS(List<List<Integer>> result, TreeNode node) {
      
      if (node == null) 
        return 0;
        
      int leftDepth = DFS(result, node.left);
      int rightDepth = DFS(result, node.right);
      int currDepth = Math.max(leftDepth, rightDepth);
      
      if(result.size() <= currDepth) 
        result.add(new ArrayList<>());
      
      result.get(currDepth).add(node.val);

      return currDepth + 1;
    }
}
