class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int n1 = nums2.length;
        Stack<Integer> st = new Stack<>();
        int [] res1 = new int[n1];
        for(int i = n1-1;i>=0;i--) {
            while(!st.isEmpty() && nums2[i] >= st.peek() ){
                st.pop();
            }
            if(st.size() == 0) res1[i] = -1;
            else res1[i] = st.peek();
            st.push(nums2[i]);
        }
          int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int val = nums1[i];
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == val) {
                    res[i] = res1[j];
                    break;
                }
            }
        }

        return res;
    }
}