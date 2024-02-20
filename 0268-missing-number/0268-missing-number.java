class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, i = 0;
        for(int num : nums) {
            sum += num - i++;
        }
        return nums.length - sum;
    }
}