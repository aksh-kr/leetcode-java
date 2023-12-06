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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp = head.next;
        ListNode newTemp = dummy;

        int sum = 0;

        if(head == null || head.next == null) return null;

        while(temp != null) {
            if(temp.val != 0) {
                sum += temp.val; 
            }else {
                ListNode node = new ListNode(sum);
                sum = 0;
                newTemp.next = node;
                newTemp = newTemp.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}