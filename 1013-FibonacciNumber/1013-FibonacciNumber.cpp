// Last updated: 6/26/2025, 10:42:30 PM
class Solution {
public:
    int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib(n-2)+fib(n-1);
    }
};