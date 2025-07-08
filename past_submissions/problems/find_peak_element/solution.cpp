class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int x=nums[0];
        int y=0;;
        for(int i=0; i<nums.size(); i++){
            if(nums[i]>x){
                x=nums[i];
                y=i;
            }

        }
        return y;
        
    }
};