package linkedlist;

public class LL7 {
    public ListNode swapNodes(ListNode head, int k) {
        if(k<=0){
            return head;
        }
        ListNode temp1 = head;
        int ct = 1;
        while(ct!=k){
            temp1 = temp1.next;
            ct++;
        }

        ListNode temp2 = temp1;
        int len = length(head);
        int pt = ct;
        while(pt!=len-k+1){
            temp2 = temp2.next;
            pt++;
        }

        int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val = temp;
        return head;
    }

    public static int length(ListNode head){
        int ct = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            ct++;
        }
        return ct;
    }
}
