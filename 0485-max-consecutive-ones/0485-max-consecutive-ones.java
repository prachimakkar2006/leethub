class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int current =0;
        int maxcurrent =0;
        for(int i=0;i<n;i++) {
            if(nums[i]==1){  current++;
            maxcurrent = Math.max(current,maxcurrent);
            }
            else current =0;
        }
        return maxcurrent;
        
    }
}