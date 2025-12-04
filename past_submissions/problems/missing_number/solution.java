class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int calXor = 0;
        for(int i =1;i<=n;i++) {
            xor^=i;
        }
        for(int x:nums) {
            calXor ^= x;
        }
        return calXor^xor;
    }
}