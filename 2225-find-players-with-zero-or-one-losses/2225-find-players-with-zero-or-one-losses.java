class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>();
        Set<Integer> oneLoss = new HashSet<>();
        Set<Integer> moreLoss = new HashSet<>();
        
        for(int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            
            //adding winner
            if(!oneLoss.contains(winner) && !moreLoss.contains(winner)) {
                zeroLoss.add(winner);
            }
            
            //add or remove loser
            if(zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            }else if(oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLoss.add(loser);
            }else if(moreLoss.contains(loser)) {
                continue;
            }else {
                oneLoss.add(loser);
            }
        }
        
        List<Integer> list1 = new ArrayList<>(zeroLoss);
        List<Integer> list2 = new ArrayList<>(oneLoss);
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        List<List<Integer>> answerList = new ArrayList<>();
        answerList.add(list1);
        answerList.add(list2);
        
        return answerList;
    }
}