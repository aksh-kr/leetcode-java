class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = prices.length;
        
        int max = prices[n-1];
        for(int i=n-1; i>= 0; i--) {
            if(prices[i] > max){
                max = prices[i];
            }
            list.add(max-prices[i]);
        }
        
        int ans = 0;
        for(int i=0; i<n ; i++) {
            if(list.get(i) > ans){
                ans = list.get(i);
            }
        }
        return ans;
    }
}