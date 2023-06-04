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
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         if(lists== null || lists.length == 0){
//             return null;
//         }
//         return mergeKLists(lists, 0, lists.length -1);
//     }
//     private ListNode mergeKLists(ListNode[] lists, int start, int end){
//         if(start==end){
//             return lists[start];
//         }
//         int mid = start + (end-start)/2;
//         ListNode left = mergeKLists(lists, start, mid);
//         ListNode right= mergeKLists(lists, mid+1, end);
//         return merge(left, right);
//     }
//     private ListNode merge(ListNode left,ListNode right){
//         ListNode head = new ListNode(-1);
//         ListNode temp = head;
//         while(left != null && right!= null){
//             if(left.val<right.val){
//                 temp.next = left;
//                 left=left.next;
//             }else{
//                 temp.next = right;
//                 right = right.next;
//             }
//             temp=temp.next;
//         }
//         while(left!=null){
//             temp.next=left;
//             left=left.next;
//             temp=temp.next;
//         }
//         while(right!=null){
//             temp.next=right;
//             right=right.next;
//             temp=temp.next;
//         }
//         return head.next;
//     }
// }
class Solution{
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null || lists.length==0) return null;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> l = new ArrayList<>();
        for(ListNode list: lists){
            while(list!=null){
                l.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(l);
        for(int val: l){
            temp.next= new ListNode(val);
            temp=temp.next;
        }
        return head.next;
    } 
}