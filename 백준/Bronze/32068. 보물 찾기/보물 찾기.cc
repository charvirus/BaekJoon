#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int t, l, r, s;
    cin >> t;
    while (t--) {
        int cnt = 1;
        cin >> l >> r >> s;
        while (l != s && r != s) {
            if (cnt % 2 == 1) {
                s += cnt;
            } else if (cnt % 2 == 0) {
                s -= cnt;
            }
            cnt++;
        }
        cout << cnt << '\n';
    }
}
