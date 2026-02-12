class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        int a =1;
        int b =2;
        int next =0;
         for(int i = 3;i<=n;i++) {
            next = a+b;
            a=b;
            b=next;
         }
         return next ;
    }
}