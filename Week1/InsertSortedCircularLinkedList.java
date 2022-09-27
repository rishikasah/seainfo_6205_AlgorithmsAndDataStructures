package Week1;

public class InsertSortedCircularLinkedList {

    public InsertSortedCircularLinkedList() {
    }

    public ListNode insert(ListNode head, int insertVal){

        /*
         * 3 Conditions for the insert: 
         *   1. current go through a round back to head.
         *   2.  cur.val <= insertVal <= cur.next.val
         *   3. insertVal super big or insertVal super small, insert into the fall down position.
         * Corner case, head == null.
         */
        
        if(head == null){
            head = new ListNode(insertVal, null);
            head.next = head;
            return head;
        }

        ListNode currentNode = head;

        while(true){

            if(currentNode.val < currentNode.next.val){
                
                if(currentNode.val<=insertVal && insertVal<=currentNode.next.val){
                    currentNode.next = new ListNode(insertVal, currentNode.next);
                    break;
                }

            }else if(currentNode.val > currentNode.next.val){

                if(currentNode.val<=insertVal || insertVal<=currentNode.next.val){
                    currentNode.next = new ListNode(insertVal, currentNode.next);
                    break;
                }
            }else{
                if(currentNode.next == head){
                    currentNode.next = new ListNode(insertVal, head);
                    break;
                }
            }

            currentNode = currentNode.next;
        }

        return head;
    }
    
}
