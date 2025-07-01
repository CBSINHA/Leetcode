// Last updated: 7/1/2025, 10:04:27 PM
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int freq=0,ans=0;
        for(int i=0;i<nums.size();i++){
            if(freq==0)ans=nums[i];
            if(ans==nums[i])freq++;
            else freq--;
        }
        return ans;
    }
};