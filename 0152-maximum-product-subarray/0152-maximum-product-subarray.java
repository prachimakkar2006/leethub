class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxP=1;
        int minP=1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(nums[i]<0) {
                int temp = maxP;
                maxP=minP;
                minP=temp;
            }
            maxP=Math.max(nums[i],maxP*nums[i]);
            minP=Math.min(nums[i],minP*nums[i]);
            max = Math.max(maxP,max);
        }
        return max;
    }
}