import java.util.LinkedList;
import java.util.Queue;

public class BinTree <T> {
    
    public Node<T> root;

    public BinTree() {

    }

    // Time - O(n), O(1) - Space
    public Node<Integer> populateNextRight(Node<Integer> root){
        
        if(root==null)
            return null;
    
        
        Queue<Node<Integer>> dfsQ=new LinkedList<>();
    
        dfsQ.add(root);
    
        while(!dfsQ.isEmpty())
        {
            Queue<Node<Integer>> myQ=new LinkedList<>();
            while(!dfsQ.isEmpty())
            {
                Node<Integer> currNode=dfsQ.poll();
                
                currNode.nextLeft=dfsQ.peek(); 
             
                if(currNode.left!=null)
                    myQ.add(currNode.left);
                 
                if(currNode.right!=null)
                    myQ.add(currNode.right);
                 
            }
        
            dfsQ=myQ;
        }
    
        return root;
    }
}