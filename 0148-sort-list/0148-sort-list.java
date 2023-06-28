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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=null;
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(slow);
        return mergelist(l1,l2);
    }
    ListNode mergelist(ListNode h1,ListNode h2){
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(h1!=null && h2!=null){
            if(h1.val<=h2.val){
                curr.next=h1;
                h1=h1.next;
            }else{
                curr.next=h2;
                h2=h2.next;
            }
            curr=curr.next;
        }
        curr.next=h1!=null ? h1:h2;
        return dummy.next;
    }
    
}
