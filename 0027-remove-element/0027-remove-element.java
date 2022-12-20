class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == val){
                nums[i] = 200;
                k++;
            }
        }
        
        Arrays.sort(nums);
        return n-k;
    }
}