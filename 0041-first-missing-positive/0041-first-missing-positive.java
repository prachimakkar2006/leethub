class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int exp=1;
        for(int i=0;i<n;i++) {
            if(exp==nums[i]) exp++;
            if(nums[i]>exp) return exp;
        }
        return exp;
    }
}