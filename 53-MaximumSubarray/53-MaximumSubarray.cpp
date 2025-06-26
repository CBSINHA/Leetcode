// Last updated: 6/26/2025, 10:42:46 PM
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=0;
        int maximum=INT_MIN;
        for(int i:nums){
            sum+=i;
            maximum=max(sum,maximum);
            if(sum<0)sum=0;
        }
        return maximum;
    }
};