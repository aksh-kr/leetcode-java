class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double avg = 0, ans = -100000;
        int i=0, j=0;
        int sum = 0;
        
        while(j<arr.length){
            sum += arr[j];
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                avg = sum * 1.0/k;
                if(avg > ans){
                    ans = avg;
                }
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}