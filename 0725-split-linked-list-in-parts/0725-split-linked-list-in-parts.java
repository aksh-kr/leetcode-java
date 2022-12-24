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
        ListNode temp = head;
        int size = 0;
        
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        
        int len = size / k;
        int extra = size % k;
        ListNode curr = head;
        ListNode prev = null;
        ListNode[] ans = new ListNode[k];
        
        for(int i=0; i<k; i++) {
            ans[i] = curr;
            
            prev = null;
            
            int count = len;
            
            if(extra > 0) {
                extra--;
                count++;
            }
            
            for(int j=0; j<count; j++) {
                prev = curr;
                curr = curr.next;
            }
            if(prev!= null) {
               prev.next = null;
            }
        }
        return ans;
    }
}