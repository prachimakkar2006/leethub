class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            if(nums[i]>0)
            set.add(nums[i]);
        }
        int ans=1;
        while(set.contains(ans)) ans++;
        return ans;
    }
}