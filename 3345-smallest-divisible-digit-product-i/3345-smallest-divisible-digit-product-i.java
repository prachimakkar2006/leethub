class Solution {
    public int digit(int num) {
        int pro =1;
        while(num!=0) {
            int rem = num%10;
            pro*=rem;
            num/=10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(true) { 
        if(digit(n) % t == 0) {
            return n;
        }
        n++;
        }
    }
}