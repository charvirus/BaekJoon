#include <iostream>

using namespace std;
int n, m, ans = 0;
int arr[501][501]={0,};
bool vst[501][501];
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, -1, 1};

void dfs(int y, int x, int cnt, int sum) {
    if (cnt == 4) {
        ans = max(ans, sum);
        return;
    }
    if (!vst[y][x]) {
        sum += arr[y][x];
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < n && 0 <= nx && nx < m) {
                vst[y][x] = true;
                dfs(ny, nx, cnt + 1, sum);
                vst[y][x] = false;
            }
        }
    }
    if (y + 1 < n && y - 1 >= 0 && x - 1 >= 0) {
        ans = max(ans, arr[y][x] + arr[y - 1][x] + arr[y][x - 1] + arr[y + 1][x]);
    }
    if (y + 1 < n && y - 1 >= 0 && x + 1 < m) {
        ans = max(ans, arr[y][x] + arr[y - 1][x] + arr[y][x + 1] + arr[y + 1][x]);
    }
    if (y + 1 < n && x - 1 >= 0 && x + 1 < m) {
        ans = max(ans, arr[y][x] + arr[y][x - 1] + arr[y][x + 1] + arr[y + 1][x]);
    }
    if (y - 1 >= 0 && x - 1 >= 0 && x + 1 < m) {
        ans = max(ans, arr[y][x] + arr[y][x - 1] + arr[y][x + 1] + arr[y - 1][x]);
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> arr[i][j];

    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            dfs(i, j, 0, 0);
    cout << ans;
}
