#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

vector<int> graph[100001];
bool vst[100001];
int result[100001];
int cnt = 0;
bool cmp(int a, int b) {
    return a > b;
}
void dfs(int node) {
    sort(graph[node].begin(),graph[node].end(),cmp);
    vst[node] = true;
    cnt++;
    result[node] = cnt;
    for (int i = 0; i < graph[node].size(); i++) {
        int inde=graph[node][i];
        if (!vst[inde]) {
            dfs(inde);
        }
    }
}

int main(void) {
    int n, m, r;
    cin >> n >> m >> r;
    for (int i = 0; i < m; i++) {
        int a,b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    dfs(r);
    for (int i = 1; i <= n; i++) {
        cout << result[i] << "\n";
    }
}
