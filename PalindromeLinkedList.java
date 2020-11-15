class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) 
            return true;
        if(head.next.next==null)
            return head.val==head.next.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
       slow = slow.next;
    ListNode prev = null,next = null;
        if(fast.next!=null)
            fast = fast.next;
        while(slow!=null)
        {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        boolean res = true;
        while(res && fast!=null)
        {
           res = (fast.val==head.val);
            head = head.next;
            fast = fast.next;
        }
        return res;
    }
}
