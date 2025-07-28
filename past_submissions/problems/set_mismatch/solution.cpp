class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int dup = -1, missing = -1;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    dup = nums[i];
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (find(nums.begin(),nums.end(),i)==nums.end()) {
                missing = i;
                break;
            }
        }

        return {dup, missing};
    }
};