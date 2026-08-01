class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor=0;
        int cal=0;
        for(int i=1;i<=n;i++) {
            xor^=i;

        }
        for(int j:nums){
            cal^=j;
        }
        return cal^xor;
    }
}