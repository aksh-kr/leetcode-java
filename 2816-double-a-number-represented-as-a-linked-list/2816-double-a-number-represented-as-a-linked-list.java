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
    public ListNode doubleIt(ListNode head) {
        
        ListNode reversedList = reverseList(head);
        
        int carry = 0;
        ListNode curr = reversedList, prev = null;
        
        while(curr != null) {
            int newVal = curr.val*2 + carry;
            curr.val = newVal%10;
            
            if(newVal > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
            
            prev = curr;
            curr = curr.next;
        }
        
        if(carry != 0) {
            ListNode extraNode = new ListNode(carry);
            prev.next = extraNode;
        }
        
        ListNode result = reverseList(reversedList);
        return result;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}