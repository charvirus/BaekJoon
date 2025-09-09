#include <algorithm>
#include <iostream>
#include <queue>
#include <string.h>
using namespace std;
bool vst[101];
int map[101] = {0,};
queue<pair<int, int> > q;

void bfs(int st, int dst) {
    q.push(make_pair(st, dst));
    while (!q.empty()) {
        int cur = q.front().first;
        int cnt = q.front().second;
        q.pop();
        for (int i = 1; i <= 6; i++) {
            int nx = cur + i;
            if (nx == 100) {
                cout << cnt + 1;
                return;
            } else if (nx < 100) {
                if (map[nx]!=0) {
                    nx = map[nx];
                }
                if (!vst[nx]) {
                    vst[nx] = true;
                    q.push(make_pair(nx, cnt + 1));
                }
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int m, n, st, en;
    cin >> m >> n;
    for (int i = 0; i < n; i++) {
        cin >> st >> en;
        map[st] = en;
    }
    for (int i = 0; i < m; i++) {
        cin >> st >> en;
        map[st] = en;
    }
    bfs(1, 0);
}
