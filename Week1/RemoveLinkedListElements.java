package Week1;
/*
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * Constraints:
 * The number of nodes in the list is in the range [0, 104].
 * 1 <= Node.val <= 50
 * 0 <= val <= 50
 */

public class RemoveLinkedListElements {

    public RemoveLinkedListElements() {
    }

    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return head;

        ListNode headPtr = new ListNode();
        ListNode prev = headPtr;
        ListNode curr = head;
        headPtr.next = head;
        
        while(curr != null) {
            
            if(curr.val == val)
                prev.next = curr.next;
            else
                prev = curr; 
                 
            curr = curr.next;
        }
        
        return headPtr.next;
    }
    
}
