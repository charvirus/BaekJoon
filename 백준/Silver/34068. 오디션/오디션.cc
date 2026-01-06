#include <algorithm>
#include <iostream>
using namespace std;
long n, m, cnt[200001];

int main(void) {
    ios::sync_with_stdio(0), cin.tie(0);
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        cnt[a]++;
    }
    sort(cnt+1, cnt + n+1);
    long now = -1, ans = 0;

    for (int i = 1; i <= n; i++) {
        now = max(now + 1, cnt[i]);
        ans += now - cnt[i];
    }
    cout << ans;
}
