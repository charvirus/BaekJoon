#include <iostream>
#include <queue>
#include <vector>

using namespace std;
vector<int> graph[100001];
int result[100001];
queue<int > q;
void bfs(int nd) {
    result[nd] = 1;
    q.push(nd);
    while (!q.empty()) {
        int u = q.front();
        q.pop();
        for (int i = 0; i < graph[u].size(); i++) {
            int v = graph[u][i];
            if (!result[v]) {
                result[v] = result[u]+1;
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
    bfs(r);
    for (int i = 1; i <= n; i++) {
        cout << result[i]-1 << '\n';
    }
}
