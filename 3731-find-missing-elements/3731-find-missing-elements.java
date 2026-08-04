class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> lt = new ArrayList<>();
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[n-1];
        int p=0;
        for(int i=smallest;i<=largest;i++){
            if(nums[p]==i) p++;
            else lt.add(i);
        }
        return lt;
    }
}