/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first;
        ListNode p=head;
        while(--k!=0) p=p.next;          // run loop k-1 times
        
        first=p;
        ListNode second=head;
        while(p.next!=null)
        {
            p=p.next;
            second=second.next;
        }
        
        // swap
        int d=first.val;
        first.val=second.val;
        second.val=d;
        
        return head;
    }
}
