class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) { 
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        if (size == n) {
            return head.next;
        }
        current = head;
        int position = size - n;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        
        return head;
    }
}