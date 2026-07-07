class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] ans = new int [1002];
        for(int[] trip : trips) {
            int totalP = trip[0];
            int l1 = trip[1];
            int l2 = trip[2];

            for(int i=l1;i<l2;i++) {
                ans[i] += totalP;
                if(ans[i] > capacity) return false;
            }
        }
        return true;
        
    }
}