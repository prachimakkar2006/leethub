class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        char[] ans = blocks.toCharArray();
        int i=0;
        int j=0;
        int count=0;
        int min = Integer.MAX_VALUE;
        while(j<n) {
            if(ans[j]=='W') count++;
            if(j-i+1<k) j++;
            else if(j-i+1==k) {
                min = Math.min(count,min);
                if(ans[i]=='W') count --;
                i++;
                j++;
            }
        }
        return min;
        
    }
}