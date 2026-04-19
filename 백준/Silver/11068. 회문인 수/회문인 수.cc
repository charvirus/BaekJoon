#include <algorithm>
#include <iostream>
using namespace std;


bool isPalindrome(int inp) {
    for (int i = 2; i <= 64; i++) {
        int tmp = inp;
        string s, reverse;
        while (tmp) {
            s.push_back(tmp % i);
            tmp /= i;
        }
        for (int j = s.length() - 1; j >= 0; j--) {
            reverse.push_back(s[j]);
        }
        if (s == reverse) {
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int b, inp;
    cin >> b;
    for (int i = 0; i < b; i++) {
        cin >> inp;
        cout << isPalindrome(inp) << "\n";
    }
}
