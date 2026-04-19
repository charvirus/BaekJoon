#include <iostream>
using namespace std;
int n, m, arr[1001][1001], dp[1001][1001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            cin >> arr[i][j];
            dp[i][j] = arr[i][j];
        }
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            dp[i][j] = arr[i][j] + max(dp[i-1][j],max(dp[i][j-1],dp[i-1][j-1]));
        }
    }
    cout<<dp[n][m];
}
