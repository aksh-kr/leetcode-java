class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int insertionsNeeded = 0;

        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if(stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if(stack.peek() != '(') {
                        insertionsNeeded++;
                        stack.pop();
                        stack.pop();                        
                    }
                    stack.push(c);
                }
            } else {
                if(stack.isEmpty()) {
                    insertionsNeeded++;
                    stack.push('(');
                    stack.push(c);
                } else {
                    if(stack.peek() == '(') {
                        stack.push(c);
                    } else {
                        stack.pop();
                        stack.pop();
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            return insertionsNeeded;
        } else {
            while(!stack.isEmpty()) {
                char c = stack.pop();
                if(c == '(') {
                    insertionsNeeded += 2;
                } else {
                    insertionsNeeded++;
                    stack.pop();
                }
            }
        }

        return insertionsNeeded;

    }
}