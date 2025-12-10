// Last updated: 10/12/2025, 7:49:07 pm
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int max=Integer.MIN_VALUE;
4        for(int i=0;i<accounts.length;i++){
5            int sum=0;
6            for(int j=0;j<accounts[i].length;j++){
7                sum+=accounts[i][j];
8            }
9            if(sum>max)max=sum;
10        }
11        return max;
12    }
13}