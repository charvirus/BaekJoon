#include <algorithm>
#include <iostream>
using namespace std;

char chg(char ch) {
    if (ch == 'Y') { return 'N'; } else if (ch == 'N') { return 'Y'; }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);

    int ans = 0;
    string s;
    cin >> s;
    s = "a" + s;
    for (int i = 1; i < s.length(); i++) {
        if (s[i] == 'Y') {
            ans++;
            for (int j = i; j < s.length(); j++) {
                if (j % i != 0) {
                    continue;
                }
                s[j] = chg(s[j]);
            }
        }
    }
    for (char i: s) {
        if (i == 'Y') {
            ans = -1;
            break;
        }
    }
    cout << ans;
}
