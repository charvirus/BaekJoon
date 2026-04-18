#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    priority_queue<int> pq;
    int n, m, ans = 0;
    cin >> n;
    cin >> m;
    for (int i = 0; i < n - 1; i++) {
        int inp;
        cin >> inp;
        pq.push(inp);
    }
    while (!pq.empty()) {
        int temp=pq.top();
        pq.pop();
        if (temp<m) {
            break;
        }else {
            pq.push(temp-1);
            ans++;
            m++;
        }
    }
    cout << ans << endl;
}
