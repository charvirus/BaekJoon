#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;
long n, k;

queue<pair<long long int, int> > q;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int ans = -1;
    cin >> n >> k;
    q.push({n, 1});
    while (!q.empty()) {
        long long int x = q.front().first;
        int cnt = q.front().second;
        q.pop();
        if (x == k) {
            ans = cnt;
            break;
        }
        if (x * 2 <= k) {
            q.push({x * 2, cnt + 1});
        }
        if (x * 10 + 1 <= k) {
            q.push({x * 10 + 1, cnt + 1});
        }
    }
    cout << ans;
}
