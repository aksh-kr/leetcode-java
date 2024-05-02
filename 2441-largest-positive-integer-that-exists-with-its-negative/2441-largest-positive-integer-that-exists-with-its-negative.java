class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        
        Set<Integer> seen = new HashSet<>();
        
        for(int num : nums) {
            int absNum = Math.abs(num);
            
            if(absNum > ans && seen.contains(-num)) {
                ans = absNum;
            }
            
            seen.add(num);
        }
        return ans;
    }
}