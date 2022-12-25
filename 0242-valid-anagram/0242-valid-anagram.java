class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cS = s.toCharArray();
        char[] cT = t.toCharArray();
        if(cS.length != cT.length){
            return false;
        }
        Arrays.sort(cS);
        Arrays.sort(cT);
        
        for(int i=0; i<s.length(); i++) {
            if(cS[i] != cT[i]){
                return false;
            }
        }
        return true;
    }
}