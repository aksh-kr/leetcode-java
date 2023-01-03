class Solution {
    public void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            for(int j=1+i; j<nums.length; j++) {
                if(nums[i]>nums[j]){
                    swap(nums, i, j);
                }
            }
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}