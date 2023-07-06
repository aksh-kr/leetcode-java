class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int sum = 0;
        for(int i: weights) {
            sum += i;
        }
        
        int maxW = weights[0];
        for(int i : weights) {
            if(maxW < i) {
                maxW = i;
            }
        }
        
        int start = maxW;        
        int end = sum;
        
        while(start < end) {
            int mid = start + (end - start)/2;
            
            if(possible(weights, mid, days)) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    public boolean possible ( int[] nums, int cap, int days) {
        int daysNeeded = 1, currentLoad = 0;
        for(int i : nums) {
            currentLoad += i;
            if(currentLoad > cap) {
                daysNeeded++;
                currentLoad = i;
            }
        }
        return (daysNeeded <= days);
    }
}