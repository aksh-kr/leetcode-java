class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }
        
        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            int remainder = 0;
            int reverse = 0;
            while (n != 0) {
                remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n /= 10;
            }
            set.add(reverse);
        }
        return set.size();
    }
}