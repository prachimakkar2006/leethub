class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double max =Integer.MIN_VALUE;
        int i=0;
        double average =0;
        int j=0;
        double sum =0;
        while(j<n) {
            sum += nums[j];
            if(j-i+1 <k) j++;
            else if(j-i+1 ==k) {
                average = sum/k;
                max = Math.max(max,average);
                sum -=nums[i];
                i++;
                j++;
                
            }
        }
        return max;
    }
}