class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for(int i=1; i<piles.length; i++) {
            right = Math.max(right, piles[i]);
        }
        
        int res = right;
        
        while(left <= right) {
            int k = right - (right-left)/2;
            int hours = 0;
            
            for(int p : piles) {
                hours += Math.ceil(1.0*p/k);
            }
            if(hours<=h) {
                res = Math.min(res, k);
                right = k-1;
            }else{
                left = k+1;
            }
        }
        return res;
    }
}