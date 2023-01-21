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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        while(head != null) {
            temp.add(head.val);
            head = head.next;
        }
        
        for(int i=1; i<temp.size()-1; i++){
            if(temp.get(i) > temp.get(i-1) && temp.get(i) > temp.get(i+1)){
                list.add(i);
            }
            else if (temp.get(i) < temp.get(i-1) && temp.get(i) < temp.get(i+1)){
                list.add(i);
            }
        }
    
        if(list.size() < 2) {
            return new int[]{-1, -1};
        }
        return new int[]{minDiff(list), maxDiff(list)};
    }
    
    public int minDiff(List<Integer> nums) {
        Collections.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<nums.size()-1;i++) {
            diff = Math.min(nums.get(i+1) - nums.get(i), diff);
        }
        return diff;
    }
    
    public int maxDiff(List<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i=1;i<nums.size();i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        return max - min;
    }
}