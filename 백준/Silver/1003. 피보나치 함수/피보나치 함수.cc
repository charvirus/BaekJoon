#include <iostream>
using namespace std;

int dp[41] = {0, 1, 1};

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    for (int i = 3; i < 41; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    int n = 0;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        if (x ==1) {
            cout << 0 << ' ' << 1 << '\n';
        } else if (x == 0) {
            cout << 1 << ' ' << 0 << '\n';
        } else {
            cout << dp[x - 1] << ' ' << dp[x] << '\n';
        }
    }
}