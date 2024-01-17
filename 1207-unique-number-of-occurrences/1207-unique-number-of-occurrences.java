class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(Integer value : map.values()) {
            set.add(value);    
        }
        
        return (set.size() == map.size());
    }
}