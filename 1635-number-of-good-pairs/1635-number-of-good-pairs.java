class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int goodPairs = 0;

        for(int i: nums) {
          count[i]++;
        }

        for(int n: count) {
            goodPairs += (n*(n-1))/2;
        }
        return goodPairs;
    }
}