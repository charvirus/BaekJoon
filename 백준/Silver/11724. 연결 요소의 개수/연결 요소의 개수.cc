#include<iostream>
#include<queue>
using namespace std;

vector<int> vec[1001];
int vst[1001];
int n, m, cnt = 0;
void dfs(int v) {
    vst[v] = 1;
    for (int i = 0; i < vec[v].size(); i++) {
        int idx = vec[v][i];
        if (vst[idx] == 0) {
            dfs(idx);
        }
    }
}
int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        vec[a].push_back(b);
        vec[b].push_back(a);
    }
    for (int i = 1; i <= n; i++) {
        if (vst[i] == 0) {
            cnt++;
            dfs(i);
        }
    }
    cout << cnt << endl;
}
