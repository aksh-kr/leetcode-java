class Solution {
    public int countAsterisks(String s) {
        char[] ch = s.toCharArray();
        int ca = 0;
        int cp = 0;
        for(int i=0; i<s.length(); i++){
            if(cp%2==0 && ch[i]=='*'){
                ca++;
            }else if(ch[i]=='|'){
                cp++;
            }
        }
        return ca;
    }
}