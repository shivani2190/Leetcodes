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
        while(fast!=null && fast.next!=null){//4->2->1->3
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;//to make null of 2 in l1=4->2->null
        ListNode l1=sortList(head);//head is pointing to 4
        ListNode l2=sortList(slow);//slow is pointing to 1
        return mergelist(l1,l2);//return 2->4 and 1->3
    }
    ListNode mergelist(ListNode l1,ListNode l2){//to merge two sorted list like 2->4 and 1->3
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        curr.next=l1!=null ? l1:l2;//curr moves till both l1 and l2 is not null
        return dummy.next;
    }
    
}
