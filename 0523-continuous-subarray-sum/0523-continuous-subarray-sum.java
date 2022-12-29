class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainder = new HashMap();
        // remainder, index in hashmap
        int presum = 0, r = 0;
        remainder.put(0, -1);
        
        for(int i=0; i<nums.length; i++) {
            presum += nums[i];
            r = presum % k;
            
            if(!remainder.containsKey(r)) {
                remainder.put(r, i);
            }
            else if(i - remainder.get(r) > 1){
                return true;
            }
        }
        return false;
        
    }
}