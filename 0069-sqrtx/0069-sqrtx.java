class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int num =0;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mid <= x/mid) {
                num = mid;
                start = mid+1;
            }
            else  end = mid-1;
        }
        return num;
    }
}