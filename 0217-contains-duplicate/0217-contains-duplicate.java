class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
       Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>=2) return true;
        }
        return false;
    }
}