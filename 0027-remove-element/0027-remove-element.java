class Solution {
    public int removeElement(int[] nums, int val) {
        int startIndex = 0;
        int endIndex = nums.length -1;

        while(startIndex <= endIndex) {
            while(endIndex >=0 && nums[endIndex] == val) {
                endIndex--;
            }

            while(startIndex < nums.length && nums[startIndex] != val) {
                startIndex++;
            }

            if(startIndex < endIndex) {
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = val;
            }
        }
        return endIndex+1;
    }
}