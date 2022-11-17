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
    
    public ListNode middleNode(ListNode head) {
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
        ListNode next = head;
        
        while(curr != null) {
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }
        head = prev;
        return head;
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode revHead = reverseList(mid);
        ListNode reRevHead = revHead;
        
        while(head != null && revHead != null) {
            if(head.val != revHead.val) {
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }
        reverseList(reRevHead);
        return (head == null || revHead == null);
    }
}