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
    public int getDecimalValue(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList();
        
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        
        double ans = 0;
        int size = list.size();
        
        for(int i = size-1; i>=0; i--) {
            ans = ans + list.get(i)* Math.pow(2,size-1-i);
        }
        return (int)ans;
    }
}