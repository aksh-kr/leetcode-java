class Solution {
    public boolean halvesAreAlike(String str) {
        int l = str.length();
        str = str.toLowerCase();
        int count1 = 0;
        int count2 = 0;
       for(int i=0; i< l/2; i++){
           if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i'
                || str.charAt(i) == 'o'
                || str.charAt(i) == 'u' )
               count1++;
       } 
       for(int j=l-1; j>(l/2- 1); j--){
           if(str.charAt(j) == 'a' || str.charAt(j) == 'e'
                || str.charAt(j) == 'i'
                || str.charAt(j) == 'o'
                || str.charAt(j) == 'u') 
               count2++;
       }
        if(count1 == count2)
            return true;
        else
            return false;
    }
}