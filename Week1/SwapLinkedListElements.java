package Week1;
/*
 * You are given the head of a linked list, and an integer k.
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed)
 * Constraints:
 * he number of nodes in the list is n.
 * 1 <= k <= n <= 105
 * 0 <= Node.val <= 100
 */
public class SwapLinkedListElements {

    public SwapLinkedListElements() {
    }

    public ListNode swapNodes(ListNode head, int k) {
         
        ListNode curr = head;
        ListNode k_ahead_curr = head;
        
        while(k > 1){
            k_ahead_curr = k_ahead_curr.next;
            k--;
        }
        
        ListNode k_from_start = k_ahead_curr;
        
        while(k_ahead_curr.next != null) {
            
            k_ahead_curr = k_ahead_curr.next;
            curr = curr.next;
        }
        
        // curr will now be k'th pos from end and k_from_start will be at kth pos from start
        
        int tempVal = k_from_start.val;
        k_from_start.val = curr.val;
        curr.val = tempVal;
        
        return head;
    }
    
}
