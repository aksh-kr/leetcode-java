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
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0, head);
        int presum = 0;
        
        map.put(0, dummy);
        
        ListNode temp = head;
        while(temp != null){
            presum += temp.val;
            map.put(presum, temp);
            temp = temp.next;
        }
        
        temp = dummy;
        presum = 0;
        
        while(temp != null) {
            presum += temp.val;
            if(map.containsKey(presum)){
                ListNode prev = map.get(presum);
                if(prev != temp)
                temp.next = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}