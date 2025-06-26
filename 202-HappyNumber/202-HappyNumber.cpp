// Last updated: 6/26/2025, 10:42:36 PM
class Solution {
public:
int Sum(int n){
    int temp,sum=0;
    while(n>0){
    temp=n%10;
    n=n/10;
    sum+=temp*temp;
    }
    return sum;
}
    bool isHappy(int n) {
int slow = n, fast = n;
do {
    slow = Sum(slow);         
    fast = Sum(Sum(fast));   
} while (slow != fast);

return slow == 1;             

    }
};