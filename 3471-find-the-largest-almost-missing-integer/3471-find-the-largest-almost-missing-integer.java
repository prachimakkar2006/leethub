class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int i =0;
        int j=0;
        int ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        while(j<n) {
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j-i+1 == k) {
                for(int num:map.keySet()) {
                    count.put(num,count.getOrDefault(num,0)+1);
                }
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        for(int num:count.keySet()) {
            if(count.get(num)==1) {
                int len = num;
                ans = Math.max(ans,len);
            }
        }
        return ans;
    }
}