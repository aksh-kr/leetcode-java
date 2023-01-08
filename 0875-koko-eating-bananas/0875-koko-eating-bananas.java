class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        for(int i=0; i<piles.length; i++){
            right = Math.max(right, piles[i]);
        }
        
        int res = right;
        
        while(left <= right) {
            int rate = right - (right-left)/2;
            int time = 0;
            
            for(int p : piles){
                time += Math.ceil(1.0 * p/rate);
            }
            
            if(time <= h) {
                res = Math.min(res, rate);
                right = rate -1;
            }else{
                left = rate + 1;
            }
        }
        return res;
    }
}