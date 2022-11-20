class Solution {
    public int mySqrt(int x) {
        long s = 0;
        long e = x;
        
        while(s <= e) {
            long m = s + (e-s)/2;
            if(m*m > x) {
                e = m-1;
            } else if(m*m < x) {
                s = m+1;
            } else {
                return (int)m;
            }
        }
        return (int)e;
    }
}