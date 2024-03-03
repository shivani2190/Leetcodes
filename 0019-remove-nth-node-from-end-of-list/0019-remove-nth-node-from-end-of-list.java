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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy; 
        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) {
                return head; // The length of the list is less than n
            }
            fast = fast.next;
        }
        // Move fast to the end, maintaining the gap of n between fast and slow pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // Remove the N-th node from the end
        slow.next = slow.next.next;
        
        return dummy.next;
   }
}