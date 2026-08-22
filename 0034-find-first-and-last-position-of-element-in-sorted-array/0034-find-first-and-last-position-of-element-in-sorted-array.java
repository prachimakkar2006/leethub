class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int num1 =-1;
        int num2=-1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(nums[mid] == target) {
                num1=mid;
                end = mid-1;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }
            else end = mid-1;
        }
        start = 0;
        end = n-1;
        while(start <= end) {
            int mid = start + (end -start)/2;
            if(nums[mid] == target) {
                num2=mid;
                start = mid+1;
            }
            else if(nums[mid] <target) start = mid+1;
            else end = mid-1;
        }
        return new int[] {num1,num2};
        }
}