#include <algorithm>
#include <iostream>
#include <queue>
#include <string.h>
#include <vector>

using namespace std;
vector<int> graph[100001];
bool vst[100001];
int result[100001];
int cnt = 1;
queue<int > q;

void bfs(int nd) {
    q.push(nd);
    vst[nd] = true;
    result[nd] = cnt++;
    while (!q.empty()) {
        int u = q.front();
        q.pop();
        for (int i = 0; i < graph[u].size(); i++) {
            int v = graph[u][i];
            if (!vst[v]) {
                result[v] = cnt++;
                q.push(v);
                vst[v] = true;
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
    bfs(r);

    for (int i = 1; i <= n; i++) {
        cout << result[i] << "\n";
    }
}
