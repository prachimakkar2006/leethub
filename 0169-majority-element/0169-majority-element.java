class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int a= n/2;
        int num =0;
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i])>n/2) return nums[i];     
        }
        return -1;
    }
}