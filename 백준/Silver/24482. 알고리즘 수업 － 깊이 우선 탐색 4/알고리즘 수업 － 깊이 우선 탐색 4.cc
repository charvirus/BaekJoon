#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

vector<int> graph[100001];
bool vst[100001];
int result[100001]={-1,};
int cnt = -1;
bool cmp(int a,int b) {
    return a>b;
}
void dfs(int node,int depth) {
    sort(graph[node].begin(),graph[node].end(),cmp);
    vst[node] = true;
    result[node] = depth;
    for (int i = 0; i < graph[node].size(); i++) {
        int inde=graph[node][i];
        if (!vst[inde]) {
            dfs(inde,depth+1);
        }
    }
}

int main(void) {
    int n, m, r;
    cin >> n >> m >> r;
    fill(result, result+n+1, -1);
    for (int i = 0; i < m; i++) {
        int a,b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    dfs(r,0);
    for (int i = 1; i <= n; i++) {
        cout << result[i] << "\n";
    }
}
