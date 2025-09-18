#include <cstring>
#include <iostream>
using namespace std;


int dy[] = {0, 0, 1, -1}, dx[] = {1, -1, 0, 0}, n, safe = 1, mxHeight = 0;
int map[101][101] = {0,};
bool vst[101][101];

void DFS(int y, int x, int rain) {
    vst[y][x] = true;
    for (int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if (0 <= ny && ny < n && 0 <= nx && nx < n && !vst[ny][nx] && rain<map[ny][nx]) {
            DFS(ny,nx,rain);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> map[i][j];
            mxHeight = max(mxHeight, map[i][j]);
        }
    }
    for (int height = 1; height <= mxHeight; height++) {
        int cnt = 0;
        memset(vst, false, sizeof(vst));
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (!vst[y][x] && map[y][x] > height) {
                    DFS(y, x, height);
                    cnt++;
                }
            }
        }
        safe = max(safe, cnt);
    }
    cout << safe;
}
