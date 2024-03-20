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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        List<Integer> mergeArray = new ArrayList<>();
        
        // Add list1 node values before `a` to the array.
        int index = 0;
        ListNode current1 = list1;
        while (index < a) {
            mergeArray.add(current1.val);
            current1 = current1.next;
            index++;
        }

        // Add list2 node values to the array
        ListNode current2 = list2;
        while (current2 != null) {
            mergeArray.add(current2.val);
            current2 = current2.next;
        }

        // Find node b + 1
        while (index < b + 1) {
            current1 = current1.next;
            index++;
        }

        // Add list1 node values after `b` to the array.
        while (current1 != null) {
            mergeArray.add(current1.val);
            current1 = current1.next;
        }

        // Build a linked list with the result by iterating over the array
        // in reverse order and inserting new nodes to the front of the list
        ListNode resultList = null;
        for (int i = mergeArray.size() - 1; i >= 0; i--) {
            ListNode newNode = new ListNode(mergeArray.get(i), resultList);
            resultList = newNode;
        }
        return resultList;
    }
}
