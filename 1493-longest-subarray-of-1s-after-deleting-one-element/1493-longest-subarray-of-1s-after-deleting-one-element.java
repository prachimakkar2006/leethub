class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int count =0;
        int max=0;
        int k=1;
        while(j<n) {
            if(nums[j]==0) count++;
            while(count>k){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
            
        }
        if(count ==0) return n-1;
        return max-1;
    }
}