/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> l= new HashSet<>();
        while(head!=null){
            if(l.contains(head)){
                return true;
            }else{
                l.add(head);
            }
            head=head.next;
        }
        return false;
    }
}