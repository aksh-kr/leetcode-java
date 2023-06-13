class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> map = new HashMap<>();
        for(int[] rectangle : rectangles) {
            double div = (double) rectangle[0] / rectangle[1];
            map.put(div, map.getOrDefault(div, 0L) + 1);
        }
        
        long ans = 0;
        
        for(Map.Entry<Double, Long> entry : map.entrySet()){
            if(entry.getValue() > 1) {
                Long n = entry.getValue();
                ans += (n*(n-1))/2;
            }
        }
        return ans;
               
    }
}