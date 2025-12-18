#include <algorithm>
#include <cmath>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        int len = s.length(), l = sqrt(len), idx = l - 1;
        while (len--) {
            cout << s[idx];
            idx += l;
            if (idx >= s.length()) {
                idx -= l * l + 1;
            }
        }
        cout << "\n";
    }
}
