package quiz1;

class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    if (p == null && q == null)
      return true;

    // one of p and q is null
    if (q == null || p == null)
      return false;

    if (p.val != q.val)
      return false;

    return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
  }
}
