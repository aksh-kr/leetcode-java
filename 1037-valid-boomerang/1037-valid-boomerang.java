class Solution {
    public boolean isBoomerang(int[][] p) {
        float a = p[0][0]*(p[1][1]-p[2][1]) + p[1][0]*(p[2][1]-p[0][1]) + p[2][0]*(p[0][1]-p[1][1]);
        
        if (a == 0)
            return false;
        else
            return true;
    }
}

// [x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)]