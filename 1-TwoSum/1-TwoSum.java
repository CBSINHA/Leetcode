// Last updated: 6/26/2025, 10:42:58 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}