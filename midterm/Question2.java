package midterm;

public class Question2 {

    // O(n)
    // When we call this with root, parent will be null
    public void populateParent(TreNode node, TreNode parent){
        if (node == null)
            return;

        if (parent == null)
            node.parent = null;

        if (node.left != null)
            node.left.parent = node;

        if (node.right != null)
            node.right.parent = node;

        populateParent(node.left, node);
        populateParent(node.right, node);
    }

    public void print(TreNode node) {
        if (node == null)
            return;

        if(node.parent != null)
            System.out.println(node.val + " -> " + node.parent.val);

        print(node.left);
        print(node.right);
    }


}
