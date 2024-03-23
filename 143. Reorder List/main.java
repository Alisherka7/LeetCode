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
    public void reorderList(ListNode head) {
        if (head.next == null) return;
        Stack<ListNode> st = new Stack<>();
        ListNode s = head, mid = head, temp = head;
        
        while (mid != null && mid.next != null) {
            s = s.next;
            mid = mid.next.next;
        }
        
        while (temp.next != s) temp = temp.next;
        temp.next = null;
        temp = s;
        
        
        while (s != null) {
            mid = s;
            st.push(s);
            s = s.next;
            mid.next = null;
        }
        
        while (!st.empty() && head != null) {
            mid = head.next;
            head.next = st.pop();
            head = head.next;
            head.next = mid;
            s = head;
            head = head.next;
        }
        
        if (s.val != temp.val) s.next = temp;
    }
}
