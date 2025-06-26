// Last updated: 6/26/2025, 10:42:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        else{
            int num=x,rev=0;
            while(num>0){
                int temp=num%10;
                num/=10;
                rev=rev*10+temp;
            }
            if(rev==x) return true;
            else return false;
        }
    }
}