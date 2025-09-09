#include <algorithm>
#include<iostream>
#include <vector>

using namespace std;
int n, m, sx, sy, res = 0;
char map[601][601];
bool vst[601][601];
int dy[4] = {0, 0, -1, 1};
int dx[4] = {-1, 1, 0, 0};

void dfs(int y, int x) {
    vst[y][x] = true;
    if (map[y][x] == 'P') {
        res++;
    }
    for (int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if (0 <= ny && ny < n && 0 <= nx && nx < m && !vst[ny][nx]) {
            if (map[ny][nx] != 'X') {
                dfs(ny, nx);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> map[i][j];
            if (map[i][j] == 'I') {
                sy = i;
                sx = j;
            }
        }
    }
    dfs(sy, sx);
    if (res == 0) {
        cout << "TT" << '\n';
    } else {
        cout << res << '\n';
    }
}
