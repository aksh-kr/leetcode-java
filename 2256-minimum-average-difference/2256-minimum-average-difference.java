class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE, sum = 0;
        int leftIndex = 0, ansIndex = -1;
        long prefixSum = 0;
        
        for(int i : nums) {
            sum += i;
        }
        
        while(leftIndex < nums.length){
            prefixSum += nums[leftIndex];
            long leftAvg = prefixSum / (leftIndex+1);
            long rightSum = sum - prefixSum;
            if(rightSum != 0) {
                rightSum /= (nums.length - leftIndex - 1);
            }
            
            long res = Math.abs(leftAvg - rightSum);
            if (res < min) {
                min = res;
                ansIndex = leftIndex;
            }
            leftIndex++;
        }
        return ansIndex;
    }
}