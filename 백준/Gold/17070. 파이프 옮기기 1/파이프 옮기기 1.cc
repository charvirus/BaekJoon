#include <algorithm>
#include <iostream>
using namespace std;
int n, ans;
int map[17][17];
int dx[3] = {0, 1, 1};
int dy[3] = {1, 0, 1};

bool check(int x, int y) {
    if (1 <= x && x <= n && 1 <= y && y <= n && map[x][y] == 0) return true;
    else return false;
}

void dfs(int x, int y, int dir) {
    if (x == n && y == n) {
        ans++;
        return;
    }
    for (int i = 0; i < 3; i++) {
        if ((dir == 0 && i == 1) || (dir == 1 && i == 0))continue;

        int nx = x + dx[i];
        int ny = y + dy[i];
        if (!check(nx, ny)) continue;
        if (i == 2 && (map[x + 1][y] == 1 || map[x][y + 1] == 1)) continue;
        dfs(nx, ny, i);
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            cin >> map[i][j];
        }
    }
    dfs(1,2,0);
    cout<<ans;
}
