#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int a, k, dp[1000001];

int bfs() {
    queue<pair<int, int> > q;
    q.push({a, 0});

    while (!q.empty()) {
        auto [cur,cnt] = q.front();
        q.pop();
        if (cur == k) {
            return cnt;
        }
        if (cur + 1 < 1000001 && !dp[cur + 1]) {
            dp[cur + 1] = 1;
            q.push({cur+1,cnt+1});
        }
        if (cur * 2 < 1000001 && !dp[cur*2]) {
            dp[cur * 2] = 1;
            q.push({cur*2,cnt+1});
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> a >> k;
    cout << bfs();
}
