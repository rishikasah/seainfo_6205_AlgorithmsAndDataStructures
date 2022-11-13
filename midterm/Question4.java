public class Question4 {

    // O(n^2)
    
        public ListNode insertionSortList(ListNode head) {
         
            if (head == null)
                return head;

         // Get a dummy head
         ListNode ptrHead = new ListNode();
         ptrHead.next = head;

         ListNode ptrNext = head.next;

         head.next = null;

         while (ptrNext != null) {

           ListNode nextNxt = ptrNext.next;

           int valNode = ptrNext.val;

           ListNode insAfter = ptrHead;

           while (insAfter.next != null && insAfter.next.val < valNode) {
            insAfter = insAfter.next;
           }
           ListNode insertBefore = insAfter.next;
           insAfter.next = ptrNext;
           ptrNext.next = insertBefore;
           ptrNext = nextNxt;
         }
         return ptrHead.next;
       }
    
}
