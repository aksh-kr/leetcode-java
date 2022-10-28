class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                s.push(ch);
            }else if(ch == ')'){
                if(s.size()==0 || s.peek() != '('){
                    return false;
                }else{
                    s.pop();
                }
            }else if(ch == ']'){
                if(s.size()==0 || s.peek() != '['){
                    return false;
                }else{
                    s.pop();
                }
            }else if(ch == '}'){
                if(s.size()==0 || s.peek() != '{'){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return s.size()==0;
    }
}