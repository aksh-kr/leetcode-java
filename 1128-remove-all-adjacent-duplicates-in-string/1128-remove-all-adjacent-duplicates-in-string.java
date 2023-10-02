class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1; i<s.length(); i++) {
          if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
            stack.pop();
          }else{
            stack.push(s.charAt(i));
          }
        }
        StringBuffer ans = new StringBuffer();
        
        while(!stack.isEmpty()) {
          ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}