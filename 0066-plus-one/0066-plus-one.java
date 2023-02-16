class Solution {
    public int[] plusOne(int[] digits) {
        int[] rev = new int[digits.length];
        for(int i=0; i<digits.length; i++) {
            rev[i] = digits[digits.length-1-i];
        }
        
        rev[0] = rev[0] + 1;
        int i = 0;
        int carry=0, sum = 0;
        ArrayList<Integer> ans = new ArrayList();
        
        while(i<rev.length || carry==1) {
            sum = carry;
            if(i<rev.length) {
            sum += rev[i];
            }
            ans.add(sum%10);
            carry = sum/10;
            i++;
        }
        
        Collections.reverse(ans);
        int[] answer = new int[ans.size()];
        
        for(int j=0; j<ans.size(); j++) {
            answer[j] = ans.get(j);
        }
        
        return answer;
    }
}