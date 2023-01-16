class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg = 0, ans = 0, i = 0, j = 0;
        int sum = 0;
        
        while(j < arr.length) {
            sum += arr[j];
            
            if(j-i+1 < k) {
                j++;
            }else if(j-i+1 == k) {
                avg = sum/k;
                if(avg >= threshold){
                    ans++;
                }
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}