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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(0, list1);
        ListNode tempA = list1;
        ListNode tempB = list1;
        ListNode end2 = list2;
        
        while(end2.next != null) {
            end2 = end2.next;
        }
        
        while(--a > 0) {
            tempA = tempA.next;
        }
        
        while(b-- >= 0) {
            tempB = tempB.next;
        }
        
        tempA.next = list2;
        
        end2.next = tempB;
        
        return dummy.next;
    }
}