// Last updated: 10/12/2025, 7:24:46 pm
1class Solution {
2    public int findNumbers(int[] nums) {
3        int count=0;
4        for(int i:nums){
5            if(String.valueOf(i).length()%2==0) count++;
6        }
7        return count;
8    }
9}