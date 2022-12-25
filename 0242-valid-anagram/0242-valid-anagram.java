class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int sLen = s.length();
        int tLen = t.length();
        
        if(sLen != tLen){
            return false;
        }
        
        for(int i=0; i<sLen; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        
        for(char c: map.keySet()){
            if(map.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}