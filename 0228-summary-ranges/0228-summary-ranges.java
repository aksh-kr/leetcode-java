class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        
        int startIndex = 0;
        int endIndex = nums.length;
        
        for(int i=0; i<=nums.length-1; i++) {
            startIndex = i;
            
            while(i != nums.length-1 && nums[i]+1 == nums[i+1]) {
                i++;
            }
            
            endIndex = i;
            
            if(startIndex == endIndex) {
                ans.add("" + nums[startIndex]);
            } else {
                ans.add(nums[startIndex] + "->" + nums[endIndex]);
            }
        }
        
        return ans;
    }
}