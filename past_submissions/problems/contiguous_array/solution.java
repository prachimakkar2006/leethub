class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int max =0;
        int balance =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0; i<n;i++) {
            if(nums[i]==1) balance++;
            else balance--;
            if(map.containsKey(balance)) max = Math.max(max,i-map.get(balance));
            else map.put(balance,i);
        }
      return max;
    }
}