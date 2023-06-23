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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode a = dummy;
        int s=0;
        for(ListNode curr= head.next;curr!=null;curr=curr.next){
            if(curr.val!=0){
                s+=curr.val;
            }else{
                a.next= new ListNode(s);
                a=a.next;
                s=0;//to make the counter 0 after displaying one sum value
            }
        }
        return dummy.next;
    }
}