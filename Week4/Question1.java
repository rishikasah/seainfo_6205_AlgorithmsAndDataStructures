package Week4;

import java.util.ArrayList;
import java.util.List;

class Question1 {

    public TreeNode sortedListToBST(ListNode head) {

        List<Integer> resultList = new ArrayList<>();
        while(head != null) {
            resultList.add(head.val);
            head = head.next;
        }
        return constructBinarySearchTree(resultList, 0, resultList.size() - 1);
    }


    public TreeNode constructBinarySearchTree(List<Integer> resultList, int low, int high) {
        if(low > high)
            return null;

        int mid = low + (high - low) / 2;

        TreeNode root = new TreeNode(resultList.get(mid));

        root.left = constructBinarySearchTree(resultList, low, mid - 1);
        root.right = constructBinarySearchTree(resultList, mid + 1, high);

        return root;
    }


}