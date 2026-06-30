class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
       int total=0;
       for(int i=0;i<n;i++) {
        total+=nums[i];
       }
       int leftsum=0;
       for(int j=0;j<n;j++) {
        int rightsum = total-leftsum-nums[j];
        if(leftsum == rightsum) return j;
        leftsum+=nums[j];
       }
       return -1;
    }
}