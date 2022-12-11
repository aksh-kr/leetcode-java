class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++) {
            int greaterIndex = -1;
            
            for(int j=nums2.length - 1; nums1[i] != nums2[j] && j>0 ; j--) {
    
                if(nums2[j] > nums1[i]) {
                    greaterIndex = nums2[j];
                }
            }
            ans[i] = greaterIndex;
        }
        return ans;
    }
}