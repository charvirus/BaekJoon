#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    int t, n;
    cin >> t;
    long long int dp[100] = {1, 1, 1, 2, 2};
    for (int i = 5; i <100; i++) {
        dp[i] = dp[i-1]+dp[i-5];
    }
    while (t--) {
        cin >> n;
        cout << dp[n-1] << '\n';
    }
}
