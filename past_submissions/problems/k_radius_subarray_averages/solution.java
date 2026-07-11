class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        
        int size = 2 * k + 1;
        if (size > n)
            return ans;

        long sum = 0;
        int i = 0;
        int j = 0;

        while (j < n) {

            sum += nums[j];

            if (j - i + 1 < size) {
                j++;
            } else if (j - i + 1 == size) {

                int center = i + k;
                ans[center] = (int) (sum / size);

                sum -= nums[i];
                i++;
                j++;
            }
        }

        return ans;
    }
}