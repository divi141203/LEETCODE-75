class Solution {
  public ListNode deleteMiddle(ListNode head) {
    ListNode x = new ListNode(0, head);
    ListNode a = x;
    ListNode b = x;
    while (b.next != null && b.next.next != null) 
    {
      a = a.next;
      b = b.next.next;
    }
    a.next = a.next.next;
    return x.next;
  }
}
