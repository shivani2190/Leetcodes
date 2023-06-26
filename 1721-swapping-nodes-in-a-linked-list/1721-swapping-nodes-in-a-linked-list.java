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
        ListNode curr = head;
        while(k>1){
            curr=curr.next;
            k--;
        }
        ListNode b = head;
        ListNode a=curr;
        while(curr.next!=null){
            b=b.next;
            curr=curr.next;
        }
        int temp = a.val;
        a.val=b.val;
        b.val=temp;
        return head;
}
}