class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<p.length(); i++){
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i),0)+1);
        }
        
        int count = map.size();
        List<Integer> ans = new ArrayList<>();
        
        int i=0, j=0;
        
        while(j<s.length()) {
            
            //calculation
            
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.get(s.charAt(j))- 1);
                if(map.get(s.charAt(j)) == 0) {
                count--;
                }
            }
            
            
            if(j-i+1 < p.length()){
                j++;
            }
            
            else if(j-i+1 == p.length()){
                // ans from calculation
                if(count == 0){
                    ans.add(i);
                }
                
                //sliding the window
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    
                    if(map.get(s.charAt(i)) == 1){
                        count++;
                    }
                }
                
               
                i++;
                j++;
            }
        }
        return ans;
    }
}