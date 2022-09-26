package Week1;

public class RotateLinkedList {

    ListNode head;

    public RotateLinkedList() {

    }
        
    public ListNode rotateList(ListNode head, int k) {
        
        // No Element, One Element or No Rotation
        if(head == null || head.next == null || k == 0)
            return head;
        
        ListNode curr = head;
        int length=1;
        
        // get list length 
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        
        // make list circular
        curr.next = head;
        
        // When k > length means there are complete rotations of the list so ignore those and get the point from where we need to break the chain
        for (int i=0;i < length - k % length; i++){
            curr = curr.next;
        }
        
        // Break the circular list
        head = curr.next;
        curr.next = null;
        
        return head;
    }   
}