package Week1;

/*
 * Given a Circular Linked List node, which is sorted in non-descending order, write a function to insert a value insertVal into the list such that it remains a sorted circular list. 
 * The given node can be a reference to any single node in the list and may not necessarily be the smallest value in the circular list.
 * If there are multiple suitable places for insertion, you may choose any place to insert the new value. 
 * After the insertion, the circular list should remain sorted.
 * If the list is empty (i.e., the given node is null), you should create a new single circular list and return the reference to that single node. 
 * Otherwise, you should return the originally given node.
 */
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
