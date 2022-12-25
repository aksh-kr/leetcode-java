class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: nums){
            h.add(i);
        }
        return !(h.size() == nums.length);
    }
}