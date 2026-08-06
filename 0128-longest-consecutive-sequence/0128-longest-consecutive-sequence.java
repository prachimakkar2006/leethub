class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max =0;
        Set<Integer> st = new HashSet<>();
        for(int num:nums) {
            st.add(num);
        }
        for(int num:st) {
            if(!st.contains(num-1)) {
                int count =1;
                int current = num;
                while(st.contains(current+1)) {
                    current++;
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}