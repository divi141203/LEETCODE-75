class Solution {
    public int pairSum(ListNode head) {
        ListNode a = head, b = head;
        while(b!=null && b.next!=null && b.next.next!=null){
            a = a.next;
            b = b.next.next;
        }
        ListNode n = a.next;
        a.next = null;
        ListNode t = reverse(n);
        ListNode t1 = t;
        int ans = 0;
        while(head!=null && t!=null){
            ans = Math.max(head.val+t.val,ans);
            head = head.next;
            t = t.next;
        }
        return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode n = head.next;
            head.next = prev;
            prev = head;
            head = n;
        }
        return prev;
    }
}
