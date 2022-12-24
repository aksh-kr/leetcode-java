class Solution {
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\P{Alnum}", "").toLowerCase();
        
        int start = 0;
        int end = str.length()-1;
        
        while(start<=end) {
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}