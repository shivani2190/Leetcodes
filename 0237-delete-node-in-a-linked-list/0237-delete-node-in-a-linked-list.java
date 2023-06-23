/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;//4->5->1->9 (to del node=5)changes to 4->1->1->9
        node.next=node.next.next;//node is now 1 then 4->1->9
    }
}