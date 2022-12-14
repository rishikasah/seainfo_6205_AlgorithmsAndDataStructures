public class ZigzagLevelOrderTraversalBT {
    // Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) 
            return result;
    
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean IsZigZag = false;
        while (!queue.isEmpty()) {
        
            List<Integer> level = new ArrayList<>();
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                
                TreeNode node = queue.poll();
                if(IsZigZag)
                    level.add(0, node.val);
                else
                    level.add(node.val);
                
                if(node.left != null)
                    queue.add(node.left);
                
                if(node.right != null)
                    queue.add(node.right);
            } 
            
            result.add(level);
            IsZigZag = !IsZigZag;
        }
        return result;
    }
}
