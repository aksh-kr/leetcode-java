class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        char res = letters[0];
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(target == letters[mid] ) {
                start = mid+1;
            } else if (target > letters[mid]) {
                start = mid+1;
            }
            else {
                res = letters[mid];
                end = mid-1;
            }
        }
        return res;
    }
}

//find smallest but larger than target 
// 1. if it is equal, we check the right part by left = mid + 1;
// 2. if it is smaller than target, we check the right part by left = mid + 1;
// 3. if it is larger(satisfied question), we set res = as the current mid, until we out of while loop. It will be the smallest one. 