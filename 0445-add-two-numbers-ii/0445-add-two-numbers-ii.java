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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseList(l1);
        ListNode head2 = reverseList(l2);
        
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        
        int carry = 0;
        
        while(head1 != null || head2 != null || carry == 1){
            int sum = carry;
            
            if(head1 != null) {
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.val;
                head2 = head2.next;
            }
            
            p.next = new ListNode(sum%10);
            p = p.next;
            carry = sum/10;
        }
        
        ListNode ans = reverseList(dummy.next);
        return ans;
    }
}