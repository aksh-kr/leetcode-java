class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();
        String[] characters = path.split("/");

        for(String dir : characters) {
            
            if(dir.equals(".") || dir.isEmpty()) {
                continue;
            }else if(dir.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }else{
                    stack.push(dir);
                }
        }

        StringBuilder result = new StringBuilder();
        for(String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}