class Solution {
    public int numberOfSteps(int num) {
        int c = 0;
        return count(num, c);
        }
    
    static int count(int n, int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return count(n/2, ++c);
        }
        return count(n-1,++c);
    }
}