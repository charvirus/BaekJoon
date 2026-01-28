#include <algorithm>
#include <iostream>
#include <queue>

using namespace std;

int t, l;
int dx[8] = {1, 2, 2, 1, -1, -2, -2, -1};
int dy[8] = {2, 1, -1, -2, -2, -1, 1, 2};

int map[300][300];
bool vst[300][300];
int chk[300][300];
queue<pair<int, int> > q;

void bfs(int targetx, int targety) {
    while (!q.empty()) {
        int x = q.front().first;
        int y = q.front().second;
        vst[x][y] = true;
        q.pop();
        if (x == targetx && y == targety) {
            cout << chk[x][y] << "\n";
            return;
        }

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 <= nx && nx < l && 0 <= ny && ny < l && !vst[nx][ny]) {
                vst[nx][ny] = true;
                chk[nx][ny] = chk[x][y] + 1;
                q.push({nx, ny});
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t;
    while (t--) {
        cin >> l;
        int nx, ny;
        int tx, ty;
        cin >> nx >> ny >> tx >> ty;
        q.push({nx, ny});
        bfs(tx,ty);
        for (int i = 0;i<300;i++) {
            for (int j = 0;j<300;j++) {
                vst[i][j] = false;
                chk[i][j] = 0;
            }
        }
        while (!q.empty()) {
            q.pop();
        }
    }
}
