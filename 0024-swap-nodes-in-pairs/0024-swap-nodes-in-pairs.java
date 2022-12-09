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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy, curr = head;
        
        while(curr != null && curr.next != null) {
            
            // save the next pointers
            ListNode nextPair = curr.next.next;
            ListNode second = curr.next;
            
            // reverse the pair of nodes
            second.next = curr;
            curr.next = nextPair;
            prev.next = second;
            
            // update pointers
            prev = curr;
            curr = nextPair;
        }
        return dummy.next;
    }
}