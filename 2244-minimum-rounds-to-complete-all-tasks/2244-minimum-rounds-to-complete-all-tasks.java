class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap();
        int rounds = 0;
        for(int i: tasks) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int count : map.values()) {
            if(count == 1){
                return -1;
            }
            
            if(count % 3 == 0) {
                rounds += count/3;
            }else{
                rounds += count/3 + 1;
            }
        }
        
        return rounds;
    }
}