// Last updated: 6/26/2025, 10:42:31 PM
class Solution {
public:
    int minChanges(string s) {
        int minChangesRequired = 0;
        for (int i = 0; i < s.length(); i += 2) {

            if (s[i] != s[i + 1]) {
                minChangesRequired++;
            }
        }

        return minChangesRequired;
    }
};