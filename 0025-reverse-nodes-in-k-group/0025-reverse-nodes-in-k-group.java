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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode begin = dummy;
        if(head == null || head.next == null || k == 1) {
            return head;
        }
        
        int i = 0;
        
        while(head != null) {
            i++;
            if(i % k == 0) {
                begin = reverseBetween(begin, head.next);
                head = begin.next;
            }
            else {
                head = head.next;
            }
        }
        return dummy.next;
    }
    
    public ListNode reverseBetween(ListNode begin, ListNode end) {
        ListNode curr = begin.next;
        ListNode prev = begin;
        ListNode next, newEnd;
        newEnd = curr;
        
        while(curr != end) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        begin.next = prev;
        newEnd.next = curr;
        
        return newEnd;
    }
}