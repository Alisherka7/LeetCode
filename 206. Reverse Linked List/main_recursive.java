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
    public ListNode reverseList(ListNode head) { // 1: 1>2>3 2:2>3 3:3, 4: null, 5:2>3
        if (head == null){
            return null; // 1: false, 2:false, 3:false, 4:true
        }

        ListNode newHead = head; // 1:newHead - 1>2>3: 2:newHead - 2>3, 3:3 
        // 1:3

        if(head.next != null){ // 1: true 2: true 3:true | 1:3
            newHead = reverseList(head.next); // 1: head.next 2>3 2:head.next 
            // 1:null
            head.next.next = head; //1: head.next.next
            //1: null<3
        }

        head.next = null;
        return newHead;
    }
}
