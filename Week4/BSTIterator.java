package Week4;

import java.util.ArrayList;
import java.util.List;

/*
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
 * boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
 * int next() Moves the pointer to the right, then returns the number at the pointer.
 * Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.
 * You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
 */
public class BSTIterator {

    List<Integer> list;
    int currPtr;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        currPtr = -1;
        inOrder(root);
    }

    public int next() {
        return list.get(++currPtr);
    }

    public boolean hasNext() {
        return currPtr < list.size() - 1;
    }

    public void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

}
