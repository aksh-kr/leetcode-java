class Solution {
    public String addBinary(String a, String b) {
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        
        int carry = 0;
        int sum = 0;
        
        StringBuilder ans = new StringBuilder();
        while(lengthA >=0 || lengthB >= 0 || carry == 1) {
            sum = carry;
            if(lengthA >= 0) {
                sum = sum + a.charAt(lengthA) - '0';
            }
            if(lengthB >= 0) {
                sum = sum + b.charAt(lengthB) - '0';
            }
            
            ans = ans.append((char)(sum%2 + '0'));
            
            carry = sum/2;
            lengthA--;
            lengthB--;
        }
        return ans.reverse().toString();
    }
}