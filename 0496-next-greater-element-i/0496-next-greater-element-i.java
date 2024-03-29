class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] nge = new int[nums2.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        for(int i = 1; i < nums2.length; i++) {
            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
                nge[stack.peek()] = nums2[i];
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            nge[stack.peek()] = -1;
            stack.pop();
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            ans[i] = nge[map.get(nums1[i])];
        }

        return ans;
    }
}