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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode();
        ListNode p = l1 , q = l2, curr = dummy;
        int c=0;
        while(p!= null|| q!= null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = c+x+y;
            c=sum/10;
            curr.next= new ListNode(sum%10);
            curr = curr.next;
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }
        if(c>0){
            curr.next= new ListNode(c);
        }
        return dummy.next;
    }
}
 // class Solution{
 //     public ListNode addTwoNumbers(ListNode l1, ListNode l2){
 //        return calculate(l1,l2,0); 
 //     }
 //     ListNode calculate(ListNode l1, ListNode l2, int carry){
 //         if(l1 == null && l2== null && carry==0 ) return null;
 //         if(l1 ==null && l2 ==null && carry!=0) return new ListNode(1);
 //         int temp = (l1==null ? 0:l1.val) + (l2==null ? 0:l2.val) + carry;
 //         ListNode res = new ListNode(temp%10);
 //         res.next= calculate(l1==null ? null:l1.next, l1==null ? null:l2.next, temp/10);
 //         return res;
 //     }
 // }