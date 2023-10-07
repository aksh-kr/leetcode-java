class Solution {
    public int majorityElement(int[] nums) {
        int majority = Integer.MIN_VALUE;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == majority) {
                count++;
            } else if(count == 0) {
                majority = nums[i];
                count = 1;
            } else {
                count--;
            }
        }
        return majority;
    }
}