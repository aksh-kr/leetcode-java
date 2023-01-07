class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int presum = 0;
        for(int i: nums) {
            presum += i;
            if(presum == k){
                count++;
            }
            if(map.containsKey(presum-k)){
                count += map.get(presum-k);
            }
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        }
        return count;
    }
}