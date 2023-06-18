class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i : nums) {
            if(map.containsKey(i-1)){
                map.put(i, false);
            }else{
                map.put(i, true);
            }
            if(map.containsKey(i+1)){
                map.put(i+1, false);
            }
        }
        
        int maxSequenceLength = 0;
        
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        for(int key : keys) {
            if(map.get(key) == true) {
                
                int count = 0;
                while(map.containsKey(key + count) == true) {
                    count++;
                }
                
                if(count > maxSequenceLength) {
                    maxSequenceLength = count;
                }
            }
        }
        return maxSequenceLength;
    }
}