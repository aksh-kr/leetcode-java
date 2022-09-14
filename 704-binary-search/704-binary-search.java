class Solution {
    public int search(int[] nums, int target) {
       return binSearch(nums, target, 0, nums.length-1);
    }
    public static int binSearch(int[] arr, int target, int s, int e){
            if(s>e)
                return -1;
        int mid = s+(e-s)/2;
        
        if(target==arr[mid]){
            return mid;
        }
        
        if(target<arr[mid]){
            return binSearch(arr, target, s, mid-1);
        }
     return binSearch(arr, target, mid+1, e);
    }
}