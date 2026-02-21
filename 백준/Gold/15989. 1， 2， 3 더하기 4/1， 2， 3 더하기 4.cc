#include <algorithm>
#include <iostream>
using namespace std;
int dp[10001][4];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    dp[1][1] = 1;

    dp[2][1] = 1;
    dp[2][2] = 1;

    dp[3][1] = 1;
    dp[3][2] = 1;
    dp[3][3] = 1;

    for (int i = 4;i<10001;i++) {
        dp[i][1] = 1;
        dp[i][2] = dp[i-2][1] + dp[i-2][2];
        dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
    }


    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int t;
        cin >> t;
        cout << dp[t][1] + dp[t][2] + dp[t][3] << "\n";
    }
}
