#include <iostream>
#define endl "\n"
using namespace std;
int stair[301];
int dp[301];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> stair[i];
    }
    dp[1] = stair[1];
    dp[2] = stair[1] + stair[2];
    dp[3] = stair[3] + max(stair[1], stair[2]);
    for (int i = 4; i <= n; i++) {
        dp[i] = stair[i] + max(stair[i-1]+dp[i-3], dp[i-2]);
    }
    cout << dp[n] << endl;
}
