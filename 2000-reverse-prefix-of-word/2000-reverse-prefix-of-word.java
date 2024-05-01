class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        int end = 0;
        while(i<word.length()) {
            if(word.charAt(i) == ch) {
                end = i;
                break;
            }
            i++;
        }
        StringBuilder revAns = reverse(word, end);
        for(int j=end+1; j<word.length(); j++) {
            revAns.append(word.charAt(j));
        }
        return revAns.toString();
    }
    
    public StringBuilder reverse(String s, int end) {
        StringBuilder sb = new StringBuilder();
        while(end>=0) {
            sb.append(s.charAt(end));
            end--;
        }
        return sb;
    }
}