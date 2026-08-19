class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=m-1;i>=0;i--) {
            while(!st.isEmpty() && st.peek() <= nums2[i]) st.pop();
            int next =-1;
            if(!st.isEmpty()) next = st.peek();
            map.put(nums2[i],next);
            st.push(nums2[i]);
        }
        for(int i=0;i<n;i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}