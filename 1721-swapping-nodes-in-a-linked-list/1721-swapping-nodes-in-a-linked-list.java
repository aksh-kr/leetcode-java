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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode last = dummy;
        dummy.next = head;
        
        for(int i = 0; i<k; i++) {
            fast = fast.next;
            last = last.next;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        int temp = slow.val;
        slow.val = last.val;
        last.val = temp;
        
        return dummy.next;
    }
}