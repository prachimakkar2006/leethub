class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        int max =0;
        for(int num : nums) {
            st.add(num);
        }
        for(int num:st) {
            if(!st.contains(num-1)) {
                int count =1;
                int current = num;
                while(st.contains(current+1)){
                    current++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}