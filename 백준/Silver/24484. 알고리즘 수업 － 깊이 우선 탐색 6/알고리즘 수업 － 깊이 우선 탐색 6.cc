#include <algorithm>
#include <iostream>
#include <string.h>
#include <vector>

using namespace std;
vector<int> graph[100001];
long long dpt[100001];
long long result[100001];
int cnt = 1;

long long sum = 0;

bool cmp(long long a, long long b) {
    return a > b;
}

void dfs(int nd, int depth) {
    dpt[nd] = depth;
    result[nd] = cnt++;
    for (int i = 0; i < graph[nd].size(); i++) {
        int indx = graph[nd][i];
        if (result[indx] == 0) {
            dfs(indx, depth + 1);
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
        sort(graph[i].begin(), graph[i].end(),cmp);
    }
    memset(dpt, -1, sizeof(dpt));
    dfs(r, 0);
    for (int i = 1; i <= n; i++) {
        sum += result[i] * dpt[i];
    }
    cout << sum << '\n';
}
