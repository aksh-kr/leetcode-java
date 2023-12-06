class Solution {
    public String replaceDigits(String s) {
        char[] ch = s.toCharArray();
        for(int i=1; i<s.length(); i+=2) {
            char temp = shift(ch[i-1], Character.getNumericValue(ch[i]));
            ch[i] = temp;
        }
        return new String(ch);
    }

    public char shift(char c, int x) {
        return (char) (c + x);
    }
}