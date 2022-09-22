class Solution {
    public String reverseWords(String s) {
        char[] ch = new char[s.length()];
        ch = s.toCharArray();
        
        int start = 0;
        
        for(int end=0; end<=ch.length; end++){
            if(end == ch.length || ch[end]==' '){
                reverse(ch, start, end-1);
                start = end+1;
            }
        }
     return new String(ch);
    }
        
        public void reverse(char[] c, int s, int e){
            while(s<e){
                char temp = c[s];
                c[s] = c[e];
                c[e] = temp;
                s++;
                e--;
            }
        }
    }