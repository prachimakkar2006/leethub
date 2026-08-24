class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] ans =  new int[1002];
        for(int[] trip:trips) {
            int pass = trip[0];
            int start = trip[1];
            int end = trip[2];
            ans[start] += pass;
            ans[end] -= pass;
        }
        int current =0;
        for(int num:ans) {
            current+=num;
            if(current>capacity) return false;
        }
        return true;
    }
}