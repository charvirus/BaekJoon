#include <iostream>
#include <queue>
using namespace std;
int arr[1001][1001] = {0,};
int m, n, sy, sx, cnt = 0;
int dy[4] = {1, -1, 0, 0};
int dx[4] = {0, 0, 1, -1};
queue<pair<int, int> > q;

void bfs() {
    while (!q.empty()) {
        int y = q.front().first;
        int x = q.front().second;
        q.pop();
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny >= 0 && ny < n && nx >= 0 && nx < m && arr[ny][nx] == 0) {
                arr[ny][nx] = arr[y][x] + 1;
                q.emplace(ny, nx);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(0);
    cin >> m >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
            if (arr[i][j] == 1) {
                q.push(make_pair(i, j));
            }
        }
    }
    bfs();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] == 0) {
                cout << -1 << '\n';
                return 0;
            } else {
                cnt = max(cnt, arr[i][j]);
            }
        }
    }
    cout << cnt - 1 << '\n';
}
