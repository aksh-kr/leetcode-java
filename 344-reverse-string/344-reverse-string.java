class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        while(start<=end){
            swap(s, start, end);
            start++;
            end--;
        }
    }
    
    
    static void swap(char[] arr, int f, int s){
        char temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}