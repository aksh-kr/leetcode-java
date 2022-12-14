class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int val = 1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int colBegin = 0;
        int colEnd = n-1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            for(int i=colBegin; i<=colEnd; i++) {
                res[rowBegin][i] = val++;
            }
            rowBegin++;
        
            for(int i=rowBegin; i<=rowEnd; i++) {
                res[i][colEnd] = val++;
            }
            colEnd--;
            
            if(rowBegin <= rowEnd) {
                for(int i=colEnd; i>= colBegin; i--) {
                    res[rowEnd][i] = val++;
                }
                rowEnd--;
            }
            
            if(colBegin <= colEnd) {
                for(int i=rowEnd; i>=rowBegin; i--) {
                    res[i][colBegin] = val++;
                }
                colBegin++;
            }
        }
        return res;
        
    }
}