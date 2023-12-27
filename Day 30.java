public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode a = odd;
        ListNode b = even;
        int i = 1;
        while (head != null) 
        {
            if (i % 2 != 0) 
            {
                a.next = head;
                a = head;
            }
            else{
                b.next = head;
                b = head;
            }
            head = head.next;
            i++;
        }
        b.next = null;
        a.next = even.next;
        return odd.next;
    }
}
