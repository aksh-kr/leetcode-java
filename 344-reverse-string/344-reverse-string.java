class Solution {
    public void reverseString(char[] s) {
        rev(s, 0, s.length-1);
    }
    
    static void rev(char[] arr, int s, int e){
        if(s>e)
            return;
        
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        
        rev(arr, ++s, --e);
    }
}