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
        while(k>1){//going to kth node
            curr=curr.next;
            k--;
        }
        ListNode b = head;//second iterator starting from head
        ListNode a=curr;
        while(curr.next!=null){
            b=b.next;
            curr=curr.next;//moving curr from kth position to forward
        }
        int temp = a.val;
        a.val=b.val;
        b.val=temp;
        return head;
}
}