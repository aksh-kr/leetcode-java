class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Pair<Integer,Integer>> s = new Stack<>();
        
        for(int i=temperatures.length-1; i>=0; i--) {
            if(s.size() == 0){
                list.add(-1);
            }else if(s.size()>0 && s.peek().getKey() > temperatures[i]){
                list.add(s.peek().getValue());
            }else if(s.size()>0 && s.peek().getKey() <= temperatures[i]) {
                while(s.size()>0 && s.peek().getKey() <= temperatures[i]){
                    s.pop();
                }
                if(s.size() == 0) {
                    list.add(-1);
                }else{
                    list.add(s.peek().getValue());
                }
            }
            s.push(new Pair<>(temperatures[i], i));
        }
        
        Collections.reverse(list);
        int[] ans = new int[temperatures.length];
        
        for(int i=0; i<temperatures.length; i++){
            if(list.get(i) < 0){
                ans[i] = 0;
            }else{
                ans[i] = list.get(i) - i;
            }
        }
        return ans;
    }
}