class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        
        int[] width = new int[n];
        int[] area = new int[n];
        
        for(int i=n-1; i>=0; i--) {
            if(s.size() == 0) {
                right.add(n);
            }else if(s.size()>0 && s.peek().getKey() < heights[i]) {
                right.add(s.peek().getValue());
            }else if(s.size()>0 && s.peek().getKey() >= heights[i]) {
                while(s.size()>0 && s.peek().getKey() >= heights[i]) {
                    s.pop();
                }
                
                if(s.size()==0){
                    right.add(n);
                }else{
                    right.add(s.peek().getValue());
                }
            }
            s.push(new Pair<>(heights[i],i));
        }
        
        Collections.reverse(right);
        while(!s.isEmpty()){
            s.pop();
        }
        
        for(int i=0; i<n; i++) {
            if(s.size() == 0){
                left.add(-1);
            } else if(s.size() > 0 && s.peek().getKey() < heights[i]) {
                left.add(s.peek().getValue());
            }else if(s.size() > 0 && s.peek().getKey() >= heights[i]) {
                while(s.size() > 0 && s.peek().getKey() >= heights[i]) {
                    s.pop();
                }
                if(s.size() == 0) {
                    left.add(-1);
                }else{
                    left.add(s.peek().getValue());
                }
            }
            s.push(new Pair(heights[i], i));
        }
        
        for(int i=0; i<n; i++) {
            width[i] = right.get(i) - left.get(i) - 1;
        }
        
        for(int i=0; i<n; i++) {
            area[i] = heights[i] * width[i];
        }
        
        int max = 0;
        for(int i=0; i<n; i++) {
            if(area[i]>max){
                max = area[i];
            }
        }
        return max;
    }
}