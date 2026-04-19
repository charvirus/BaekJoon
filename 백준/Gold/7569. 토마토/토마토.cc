#include <algorithm>
#include <deque>
#include <iostream>
#include <queue>
using namespace std;
int basket[101][101][101] = {0,};
queue<pair<pair<int, int>, int> > q;
int dz[6] = {0, 0, 0, 0, -1, 1};
int dx[6] = {0, 0, 1, -1, 0, 0};
int dy[6] = {-1, 1, 0, 0, 0, 0};
int m, n, h, cnt = 0;

void bfs() {
    while (!q.empty()) {
        int z = q.front().first.first;
        int y = q.front().first.second;
        int x = q.front().second;
        q.pop();
        for (int i = 0; i < 6; i++) {
            int nz = z + dz[i];
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= nz && nz < h && 0 <= ny && ny < m && 0 <= nx && nx < n && basket[nz][ny][nx] == 0) {
                basket[nz][ny][nx] = basket[z][y][x] + 1;
                q.push({{nz, ny}, nx});
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);


    cin >> n >> m >> h;

    for (int i = 0; i < h; i++) {
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                cin >> basket[i][j][k];
                if (basket[i][j][k] == 1) {
                    q.push({{i, j}, k});
                }
            }
        }
    }
    bfs();

    for (int i = 0; i < h; i++) {
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                if (basket[i][j][k] == 0) {
                    cout << -1 << '\n';
                    return 0;
                }
                cnt = max(cnt, basket[i][j][k]);
            }
        }
    }
    cout << cnt - 1 << '\n';
}
