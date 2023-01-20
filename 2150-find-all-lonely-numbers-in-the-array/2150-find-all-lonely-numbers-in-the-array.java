class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i: nums) {
            if(map.get(i) == 1){
               if(map.containsKey(i+1)){
                continue;
             }else if(map.containsKey(i-1)){
                continue;
             }else{
                ans.add(i);        
             } 
            }
            
        }
        return ans;
    }
}