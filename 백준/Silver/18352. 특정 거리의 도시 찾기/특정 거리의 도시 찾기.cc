#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int n, m, k, x;
vector<int> gph[300001];
bool map[300001];

void dsk() {
    priority_queue<int, vector<int>, greater<int> > pq;
    queue<int> q;
    q.push(x);
    map[x] = true;
    int dis = 0;
    while (!q.empty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int cur = q.front();
            q.pop();
            if (dis == k) {
                pq.push(cur);
                continue;
            }
            for (auto next: gph[cur]) {
                if (!map[next]) {
                    map[next] = true;
                    q.push(next);
                }
            }
        }
        dis++;
    }
    if (pq.empty()) {
        cout << -1;
    } else {
        while (!pq.empty()) {
            cout << pq.top() << "\n";
            pq.pop();
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(0);

    cin >> n >> m >> k >> x;
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        gph[a].push_back(b);
    }
    dsk();
}
