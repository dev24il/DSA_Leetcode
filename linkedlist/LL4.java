package linkedlist;

public class LL4 {
    public ListNode reverseList(ListNode head) {
        ListNode prevptr = null;
        ListNode currptr = head;
        ListNode nextptr;

        while(currptr != null){
            nextptr = currptr.next;
            currptr.next = prevptr;

            prevptr = currptr;
            currptr = nextptr;
        }

        return prevptr;
    }
}
