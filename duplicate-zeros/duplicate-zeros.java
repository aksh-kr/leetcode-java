class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i] == 0) {
                int j=n-1;
                while(j>i+1){
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[i+1] = 0;
                i += 1;
            }
        }
    }
}