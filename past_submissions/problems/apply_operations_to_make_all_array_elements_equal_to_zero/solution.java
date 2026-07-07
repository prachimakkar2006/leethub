class Solution {
    public boolean checkArray(int[] nums, int k) {
        int n =  nums.length;
        int[] diff = new int[n+1];
        int curr =0;
        for(int i=0;i<n;i++) {
            curr+=diff[i];
            int val = curr+nums[i];
            if(val == 0) continue;
            if(val <0) return false;
            if(i+k>n) return false;
            curr-=val;
            diff[i+k] +=val;
        }
        return true;
        
    }
}