package Week4;
/*
 * Convert a Binary Search Tree to a sorted Circular Doubly-Linked List in place.
 * You can think of the left and right pointers as synonymous to the predecessor and successor pointers in a doubly-linked list.
 * For a circular doubly linked list, the predecessor of the first element is the last element, and the successor of the last element is the first element.
 * We want to do the transformation in place. After the transformation, the left pointer of the tree node should point to its predecessor,
 * and the right pointer should point to its successor.
 * You should return the pointer to the smallest element of the linked list.
 */
class Question2 {

    Node resultList = new Node(0);

    public Node treeToDoublyList(Node root) {

        if(root == null)
            return root;

        // Store the first node of List
        Node listHead = resultList;

        treeInorderTraversal(root);

        // Now that we are on the last node join it to first to create cycle
        resultList.right = listHead.right;
        listHead.right.left = resultList;

        return listHead.right;
    }

    // INORDER TRAVERSAL ORDER - L N R
    public void treeInorderTraversal(Node root) {

        if(root.left == null && root.right == null) {

            Node node = new Node(root.val);
            resultList.right = node;
            node.left = resultList;
            resultList = node;
            return;
        }

        // Left traversal
        if(root.left != null) {
            treeInorderTraversal(root.left);
        }

        // Add node to list
        Node node = new Node(root.val);
        node.left = resultList;
        resultList.right = node;
        resultList = node;

        // Right traversal
        if(root.right != null) {
            treeInorderTraversal(root.right);
        }
    }
}
