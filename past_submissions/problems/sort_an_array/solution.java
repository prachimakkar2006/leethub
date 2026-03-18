class Solution {

    public int[] sortArray(int[] nums) {

        int n = nums.length;
        if (n <= 1) return nums;

        int n1 = n / 2;
        int n2 = n - n1;

        int[] a = new int[n1];
        int[] b = new int[n2];

        int idx = 0;
        for (int i = 0; i < n1; i++) {
            a[i] = nums[idx++];
        }
        for (int j = 0; j < n2; j++) {
            b[j] = nums[idx++];
        }

        a = sortArray(a);
        b = sortArray(b);

        return merge(a, b);
    }


    public int[] merge(int[] a, int[] b) {

        int n1 = a.length;
        int n2 = b.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < n1) result[k++] = a[i++];
        while (j < n2) result[k++] = b[j++];

        return result;
    }
}