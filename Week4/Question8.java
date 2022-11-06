package Week4;

/*
 * Given the root node of a binary search tree and two integers low and high,
 * return the sum of values of all nodes with a value in the inclusive range [low, high].
 */
public class Question8 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
            return 0;

        int sum = 0;

        if(root.val >= low && root.val <= high)
            sum+=root.val;

        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);
        return left + right + sum;
    }
}
