class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, end = nums.length-1;
        int res = 0;
        int sum = 0;
        
        while(start <= end){
            sum = nums[start] + nums[end];
            res = Math.max(res, sum);
            start++;
            end--;
        }
        
        return res;
    }
}