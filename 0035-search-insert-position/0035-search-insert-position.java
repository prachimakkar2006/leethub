class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int num =0;
        for(int i=0;i<n;i++) {
            if(nums[i] == target) return i;
            else if(nums[i] >= target ) return i;
            
        }
        return n;
    }
}