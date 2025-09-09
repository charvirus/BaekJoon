#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int t, res = 0;
    cin >> t;
    if (t < 10) {
        cout << t << '\n';
    } else {
        for (int i = 1; i <= t; i *= 10) {
            res += t - i + 1;
        }
        cout << res << '\n';
    }

}
