// Last updated: 6/26/2025, 10:42:40 PM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int num=0;
        for(int i:nums){
            num ^=i;
        }
        return num;
    }
};