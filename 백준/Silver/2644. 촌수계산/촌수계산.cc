#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int n, x, y, m, dist[101];
vector<vector<int> > v;

void dfs(int node, int cnt) {
    if (cnt == n) return;
    for (int i = 0; i < v[node].size(); i++) {
        int next = v[node][i];
        if (dist[next] == 0) {
            dist[next] = dist[node] + 1;
            dfs(next, cnt + 1);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> x >> y >> m;
    v.resize(n + 1);
    for (int i = 0; i < m; i++) {
        int parent, child;
        cin >> parent >> child;
        v[parent].push_back(child);
        v[child].push_back(parent);
    }
    dfs(x, 0);
    if (dist[y] == 0) {
        cout << -1;
    } else {
        cout << dist[y];
    }
}
