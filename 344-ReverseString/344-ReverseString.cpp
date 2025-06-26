// Last updated: 6/26/2025, 10:42:33 PM
class Solution {
public:
    void reverseString(vector<char>& s) {
        int length=s.size();
        int start=0;
        int end=length-1;
        while(start<end){
            swap(s[start++],s[end--]);
        }
    }
};