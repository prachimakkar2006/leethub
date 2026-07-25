class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int count =0;
        int max =0;
        int len =0;
        for(int i=0;i<n;i++) {
            count=0;
            for(int j=i;j<n;j++) {
                if(nums[j]==0) count++;
                if(count <=k) max=Math.max(max,j-i+1);
                else break;
            }
        }
        return max;
    }
}