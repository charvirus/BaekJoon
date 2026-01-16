#include <iostream>
using namespace std;
int n, dp[100001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    dp[1] = 1;
    dp[2] = 1;
    dp[3] = 2;
    dp[4] = 2;
    dp[5] = 1;
    dp[6] = 2;
    dp[7] = 1;
    cin >> n;
    for (int i = 8; i <= n; i++) {
        dp[i] = min(dp[i - 1], min(dp[i - 2], min(dp[i - 5], dp[i - 7]))) + 1;
    }
    cout << dp[n];
}
