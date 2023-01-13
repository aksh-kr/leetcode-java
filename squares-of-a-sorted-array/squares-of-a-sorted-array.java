class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0, end = nums.length-1;
        int[] result = new int[nums.length];
        
        for(int i=nums.length-1; i>=0; i--) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                result[i] = nums[start]*nums[start];
                start++;
            }else{
                result[i] = nums[end]*nums[end];
                end--;
            }
        }
        return result;
    }
}