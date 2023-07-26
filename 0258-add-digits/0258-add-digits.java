class Solution {
    public int addDigits(int num) {
        int x = num;
        while(x > 9){
            int sum = 0;
            while(x>0){
                int d = x%10;
                x /= 10;
                sum += d;
            }
            x = sum;
        }
        return x;
    }
}