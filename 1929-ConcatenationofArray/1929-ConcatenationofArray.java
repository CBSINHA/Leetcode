// Last updated: 10/12/2025, 6:57:33 pm
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans=new int[nums.length*2]; 
4        for(int i=0;i<nums.length*2;i++){
5            ans[i]=nums[i%nums.length];
6        }
7        return ans;
8    }
9}