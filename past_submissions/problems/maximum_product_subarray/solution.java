class Solution {
    public int maxProduct(int[] nums) {
      int n = nums.length;
      int maxP = nums[0];
      int minP = nums[0];
      int max = nums[0];
      for(int i=1; i<n; i++) {
        if(nums[i] < 0) {
            int temp = maxP;
            maxP = minP;
            minP = temp;
        }
        maxP = Math.max(nums[i],nums[i]*maxP);
        minP = Math.min(nums[i],nums[i]*minP);
        max = Math.max(max,maxP);
      }
      return max;

    }
}