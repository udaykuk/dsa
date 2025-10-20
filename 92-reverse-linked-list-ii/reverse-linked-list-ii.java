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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current=head;
        ListNode prev=null;
        ListNode nxt=null;
        for(int i=left;i>1;i--){
            prev=current;
            current =current.next;
        }
        ListNode l=prev;
        ListNode f=current;
        for(int i=right;current!=null&&i>left-1;i--){
            nxt=current.next;
            current.next =prev;
            prev=current;
            current=nxt;
        }
         if (l!=null){
            l.next=prev;
         }
         else{
            head=prev;
         }
         f.next=current;
         return head;
        
        // return head;
    }
}