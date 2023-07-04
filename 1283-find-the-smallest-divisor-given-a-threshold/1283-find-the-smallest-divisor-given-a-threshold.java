class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 0;
        int end = maxOfArray(nums);
        int ans = -1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(sum(nums, mid) <= threshold) {
                ans = mid;
                end = mid - 1;
            }else {
                start = mid+1;
            }
        }
        return ans;
    }
    
    public int sum(int[] nums, int divisor) {
        int sum = 0;
        for(int i : nums) {
            sum += Math.ceil((1.0*i) / divisor);            
            }
        return sum;
    }
    
    public int maxOfArray ( int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i : nums) {
            if(i > ans) {
                ans = i;
            }
        }
        return ans;
    }
}