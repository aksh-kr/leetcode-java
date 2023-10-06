class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
           while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
               nge[stack.peek()] = nums[i];
               stack.pop();
           }
           stack.push(i);
        }

        for(int i=0; i<nums.length; i++) {
           while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
               nge[stack.peek()] = nums[i];
               stack.pop();
           }
        }

        while(!stack.isEmpty()) {
            nge[stack.peek()] = -1;
            stack.pop();
        }
        return nge;

        }
    }