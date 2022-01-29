package linkedlist;

public class LL6 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenstart = even;

        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        if(odd.next != null){
            even.next = null;
        }
        odd.next = evenstart;
        
        return head;

    }
}
