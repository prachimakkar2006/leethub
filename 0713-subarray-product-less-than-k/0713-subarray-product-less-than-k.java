class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return 0;
        int i=0;
        int j=0;
        int count =0;
        int pro=1;
        while(j<n) {
            pro*=nums[j];
            while(pro>=k) {
                pro/=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}