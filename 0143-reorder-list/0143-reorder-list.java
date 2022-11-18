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
    
    public ListNode middleNode( ListNode head) {
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
        ListNode current = head;
        ListNode next = head;
        
        while(current != null) {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        
        //rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        
        // next of tail to null
        if(hf != null) {
            hf.next = null;
        }
    }
}