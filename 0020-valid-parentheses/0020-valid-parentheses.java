class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']'){
            return false;
        }

        for(int i = 0; i < s.length(); i++ ){
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else if(stack.peek() == '(' && s.charAt(i) == ')'){
                stack.pop();
            }else if(stack.peek() == '{' && s.charAt(i) == '}'){
                stack.pop();
            }else if (stack.peek() == '[' && s.charAt(i) == ']'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}