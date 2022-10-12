class VerticalOrderBinaryTreeTraversal {
  
  public List<List<Integer>> verticalOrder(TreeNode root) {
    
    List<List<Integer>> result = new ArrayList();
    
    if (root == null)
      return result;

    Map<Integer, ArrayList> colTable = new HashMap();

    Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
    int column = 0;
    queue.offer(new Pair(root, column));

    int minColumn = 0, maxColumn = 0;

    while (!queue.isEmpty()) {
      Pair<TreeNode, Integer> p = queue.poll();
      root = p.getKey();
      column = p.getValue();

      if (root != null) {
        if (!colTable.containsKey(column)) {
          colTable.put(column, new ArrayList<Integer>());
        }
        colTable.get(column).add(root.val);
        minColumn = Math.min(minColumn, column);
        maxColumn = Math.max(maxColumn, column);

        queue.offer(new Pair(root.left, column - 1));
        queue.offer(new Pair(root.right, column + 1));
      }
    }

    for(int i = minColumn; i < maxColumn + 1; ++i) {
      result.add(colTable.get(i));
    }

    return result;
  }
}
