package linkedlist;

public class LL5 {
    public ListNode removeElements(ListNode head, int val) {
        while(head.val == val){
            head = head.next;
        }
        ListNode ptr = head;
        ListNode prev = null;

        while(ptr != null){
            if(ptr.val == val){
                prev.next = ptr.next;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        return head;
    }
}
