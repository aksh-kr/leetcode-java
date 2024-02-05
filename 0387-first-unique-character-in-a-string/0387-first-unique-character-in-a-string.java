class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        char ans = '0';
        for(Character key : map.keySet()) {
            if(map.get(key) == 1) {
                ans = key;
                break;
            }
        }
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ans) {
                return i;
            }
        }
        return -1;
    }
}