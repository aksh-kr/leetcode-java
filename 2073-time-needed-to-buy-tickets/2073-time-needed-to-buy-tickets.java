class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int time = 0;
        for(int i=0; i<nums.length; i++) {
            if(i<=k){
                time += Math.min(nums[i], nums[k]);
            }else{
                time += Math.min(nums[i], nums[k]-1);
            }
        }
        return time;
    }
}