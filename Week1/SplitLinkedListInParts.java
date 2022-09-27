package Week1;

public class SplitLinkedListInParts {

    public SplitLinkedListInParts() {

    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode [] result = new ListNode[k];
        
        if(head == null || k == 0)
            return result;
        
        int length = 0;
        ListNode current  = head;
    
        // Get Length of the list
        while (current != null) {
            current = current.next;
            length++;
        }
        
        // number of buckets where one extra element will be added
        int extra_ele_bucket = length % k;
        
        // No of elements in each bucket
        int no_of_elem = length / k;
        
        current = head;
        
        for (int i = 0; i < k; i++) {
            
            result[i] = current;
            
            // Check to get the currect bucket size
            int total_elem = no_of_elem + (i < extra_ele_bucket ? 1 : 0);
           
            for (int j = 0; j < total_elem; j++) {
                // IF tail, set next element to null
                if (j == total_elem - 1) {
                    ListNode next = current.next;
                    current.next = null;
                    current = next;
                } else {
                    current = current.next;
                }
            }
        }
        return result;
    }
    
}
