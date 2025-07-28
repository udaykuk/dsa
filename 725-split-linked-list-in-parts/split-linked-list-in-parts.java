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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;

        // Find the size of list.
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        ListNode[] ans = new ListNode[k];
        curr = head;
 
        for (int i = 0; i < n % k; i++) {
            ans[i] = curr;

          
            for (int j = 1; j < n / k + 1 && curr != null;
                 j++) {
                curr = curr.next;
            }

          
            if (curr != null) {
                ListNode tmp = curr.next;
                curr.next = null;
                curr = tmp;
            }
        }

       
        for (int i = n % k; i < k; i++) {
            ans[i] = curr;

          
            for (int j = 1; j < n / k && curr != null;
                 j++) {
                curr = curr.next;
            }

            
            if (curr != null) {
                ListNode tmp = curr.next;
                curr.next = null;
                curr = tmp;
            }
        }

        return ans;
    }
}
    