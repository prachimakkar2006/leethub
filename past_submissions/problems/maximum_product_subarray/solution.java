class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minP=1;
        int maxP =1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(nums[i]<0) {
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(nums[i],nums[i]*maxP);
            minP= Math.min(nums[i],nums[i]*minP);
            max = Math.max(max,maxP);
        }
        return max;

        
        
    }
}