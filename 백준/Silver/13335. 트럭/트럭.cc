#include <algorithm>
#include <iostream>
#include <queue>
using namespace std;

int n, w, l, totalTime, cw, idx;
vector<int> v;
queue<pair<int, int> > bridge;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> w >> l;
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        v.push_back(a);
    }

    while (idx < n || !bridge.empty()) {
        if (!bridge.empty() && bridge.front().second == totalTime) {
            cw -= bridge.front().first;
            bridge.pop();
        }

        if (idx < n && cw + v[idx] <= l && bridge.size() < w) {
            cw += v[idx];
            bridge.push({v[idx], totalTime + w});
            idx++;
        }
        totalTime++;
    }
    cout << totalTime;
}
