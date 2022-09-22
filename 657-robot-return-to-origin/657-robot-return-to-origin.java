class Solution {
    public boolean judgeCircle(String moves) {
        int countFB = 0;
        int countSW = 0;
        
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='U')
                countFB++;
            else if(moves.charAt(i)=='D')
                countFB--;
            else if(moves.charAt(i)=='R')
                countSW++;
            else if(moves.charAt(i)=='L')
                countSW--;
        }
        if(countFB==0 && countSW==0)
            return true;
        else
            return false;
    }
}