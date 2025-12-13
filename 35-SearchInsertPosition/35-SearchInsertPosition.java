// Last updated: 13/12/2025, 5:16:24 pm
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int length=nums.length;
4        if(length==0)return 0;
5        int start=0,end=length-1,mid;
6        while(start<=end){
7            mid=start+(end-start)/2;
8            if(nums[mid]==target) return mid;
9            else if(nums[mid]<target) start=mid+1;
10            else end=mid-1;
11        }
12        return start;
13    }
14}