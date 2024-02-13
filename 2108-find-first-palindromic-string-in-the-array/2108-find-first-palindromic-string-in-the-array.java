class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words) {
            if(isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    
    public boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
            
        while(start < end) {
           if(word.charAt(start) == word.charAt(end)) {
                start++;
                end--;
                }else{
                    return false;
                }
            }
            return true;
    }
}