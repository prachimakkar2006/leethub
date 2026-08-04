class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start=0;
        int end=n-1;
        if(nums[start] <= nums[end] ) return nums[start];
        while(start<=end) {
            int mid = start + (end -start)/2;
            int prev = (mid+n-1)%n;
            int next = (mid+1)%n;
            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]) return nums[mid];
            else if(nums[mid] >= nums[0]) start = mid+1;
            else end = mid-1;
        }
        return 0;
    }
}