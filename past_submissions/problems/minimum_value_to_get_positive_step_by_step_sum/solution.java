class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int minprefix = Integer.MAX_VALUE;
        int prefix = 0;
        for(int i=0; i<n; i++) {
            prefix+=nums[i];
            minprefix=Math.min(prefix,minprefix);
        }
        if(minprefix>=1) return 1;
        return 1-minprefix;
        
    }
}