class Solution {
    public int findClosestNumber(int[] nums) {
        int distance = Integer.MAX_VALUE;
        int ans =  Integer.MIN_VALUE;
        for(int i : nums) {
            if(distance > Math.abs(i)) {
                distance = Math.abs(i);
                ans = i;
            }else if (distance == Math.abs(i)) {
                ans = Math.max(ans, i);
            }
        }
        return ans;
    }
}