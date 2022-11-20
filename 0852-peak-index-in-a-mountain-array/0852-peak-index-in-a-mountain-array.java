class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end) {
            int mid = end - (end-start)/2;
            
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            } else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]) {
                start = mid;
            } else if(nums[mid]<nums[mid-1] && nums[mid]>nums[mid+1]) {
                end = mid;
            }
        }
        return -1;
    }
}