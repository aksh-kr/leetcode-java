class Solution {
    public int minSwaps(String s) {
        int close = 0, maxClose = 0;

        for(char c : s.toCharArray()) {
            if(c == '[') {
                close -= 1;
            } else {
                close += 1;
            }
            maxClose = Math.max(close, maxClose);
        }

        return (maxClose + 1)/2;
    }
}