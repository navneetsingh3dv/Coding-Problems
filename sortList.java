class Solution {
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null)
           return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode x = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(x);
        return merge(left,right);
    }
    public ListNode merge(ListNode head1,ListNode head2)
    {
        ListNode head = new ListNode(-1);
        ListNode point = head;
        while(head1!=null && head2!=null)
        {
            if(head1.val < head2.val)
            {
                point.next = head1;
                head1 = head1.next;
                point = point.next;
                point.next = null;
            }
            else
            {
                point.next = head2;
                head2 = head2.next;
                point = point.next;
                point.next = null; 
            }
        }
        if(head1!=null)
            point.next = head1;
        if(head2!=null)
            point.next = head2;
        return head.next;
    }
}
