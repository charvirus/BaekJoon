#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;
string s, ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        if (isupper(s[i])) {
            ans += s[i];
        }
    }
    cout << ans;
}
