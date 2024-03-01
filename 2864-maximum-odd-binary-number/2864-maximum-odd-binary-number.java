class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = 0, zero = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                one++;
            }else{
                zero++;
            }
        }
        StringBuilder sb = new StringBuilder("1");
        one--;
        while(zero > 0) {
            sb.append("0");
            zero--;
        }
        while(one > 0) {
            sb.append("1");
            one--;
        }
        
        return sb.reverse().toString();
    }
}