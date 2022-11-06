package Week4;
/*
 * You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake.
 * Recover the tree without changing its structure.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Question4 {

    List<Integer> tmpList;
    int i = 0 ;

    public void recoverTree(TreeNode root) {

        tmpList = new ArrayList<>() ;
        InorderTraversal(root) ;
        Collections.sort(tmpList) ;
        solveSwap(root) ;
    }

    public void InorderTraversal(TreeNode root){
        if(root == null)
            return ;

        InorderTraversal(root.left) ;

        tmpList.add(root.val) ;

        InorderTraversal(root.right) ;
    }

    public void solveSwap(TreeNode root){
        if(root == null)
            return ;

        solveSwap(root.left);

        if(tmpList.get(i) != root.val)
            root.val = tmpList.get(i) ;

        i++ ;

        solveSwap(root.right) ;
    }
}