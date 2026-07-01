class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxAltitude = Integer.MIN_VALUE;
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        for(int i=1;i<n+1;i++) {
            prefix[i] = prefix[i-1] + gain[i-1];
            maxAltitude = Math.max(maxAltitude,prefix[i]);
        }
        if(maxAltitude<=0) return 0;
        return maxAltitude;

        
    }
}