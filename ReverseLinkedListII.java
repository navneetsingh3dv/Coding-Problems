class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n)
            return head;
        if(head==null || head.next==null)
            return head;
        int i = 1;
        ListNode back = head;
        ListNode origin = head;
        while(i<m)
        {
            back = origin;
           origin = origin.next;
            i++;
        }
        ListNode prev = null,next = null;
        while(i<=n)
        {
            i++;
            next = origin.next;
            origin.next = prev;
             prev = origin;
            origin = next;
        }
        if(m==1)
        {
            back.next = origin;
            return prev;
        }
        back.next.next = origin;
        back.next = prev;
        return head;
    }
}
