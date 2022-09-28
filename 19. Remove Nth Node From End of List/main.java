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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {     
//         // Time complexity O(n)
//         // Space complexity O(1)
       ListNode tmp = head;
        int count = 0;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
        
        if(count == 1 && n == 1){
            return null;
        }
        if(count == n){
            head = head.next;
            return head;
        }
        tmp = head;
        for(int i = 1; i<=count - n -1; i++){
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return head;
    }
}
