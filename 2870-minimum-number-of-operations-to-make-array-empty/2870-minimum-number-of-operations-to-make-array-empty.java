class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int c : map.values()) {
            if(c == 1) {
                return -1;
            }
            count += Math.ceil((double) c / 3);
        }
        return count;
    }
}