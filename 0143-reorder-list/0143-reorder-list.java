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
    
    public ListNode midNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList (ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid = midNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        
        while(hf != null && hs != null) {
            ListNode temp1 = hf.next;
            hf.next = hs;
            hf = temp1;
            
            ListNode temp2 = hs.next;
            hs.next = hf;
            hs = temp2;
        }
        
        if(hf != null) {
            hf.next = null;
        }
    }
}