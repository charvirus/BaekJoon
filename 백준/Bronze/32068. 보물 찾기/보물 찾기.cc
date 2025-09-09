#include <iostream>
#include <queue>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int t, l, r, s;
    cin >> t;
    while (t--) {
        cin >> l >> r >> s;
        int ls = s - l, rs = r - s;
        if (rs > ls) {
            cout << ls * 2 + 1 << '\n';
        } else {
            cout << rs * 2 << '\n';
        }
    }
}
