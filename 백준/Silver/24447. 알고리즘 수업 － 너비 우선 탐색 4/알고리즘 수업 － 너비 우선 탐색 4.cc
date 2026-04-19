#include <algorithm>
#include <iostream>
#include <queue>
#include <string.h>
#include <vector>

using namespace std;
vector<int> graph[100001];
queue<int> q;
long long result[100001], depth[100001], cnt = 1,sum = 0;

void bfs(int nd) {
    depth[nd] = 0;
    result[nd] = 1;
    q.push(nd);
    while (!q.empty()) {
        int u = q.front();
        result[u] = cnt++;
        q.pop();
        for (int i = 0; i < graph[u].size(); i++) {
            int v = graph[u][i];
            if (depth[v] == -1) {
                depth[v] = depth[u] + 1;
                q.push(v);
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m, r;
    cin >> n >> m >> r;
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    for (int i = 1; i <= n; i++) {
        sort(graph[i].begin(), graph[i].end());
    }
    memset(depth, -1, sizeof(depth));
    bfs(r);
    for (int i = 1; i <= n; i++) {
        sum += result[i] * depth[i];
    }
    cout << sum;
}
