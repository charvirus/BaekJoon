#include <algorithm>
#include <iostream>
#include <string.h>
using namespace std;
char arr[101][101] = {0,};
bool vst[101][101];
int dx[4] = {0, 0, 1, -1};
int dy[4] = {-1, 1, 0, 0};
int n, cnt = 0;

void dfs(int y, int x) {
    vst[y][x] = true;
    for (int i = 0; i < 4; i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if (0 <= nx && nx < n && 0 <= ny && ny < n && !vst[ny][nx]) {
            if (arr[ny][nx] == arr[y][x]) {
                dfs(ny, nx);
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);


    cin >> n;
    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        for (int j = 0; j < n; j++) {
            arr[i][j] = s[j];
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (!vst[i][j]) {
                dfs(i, j);
                cnt++;
            }
        }
    }
    cout << cnt << " ";
    cnt = 0;
    memset(vst, false, sizeof(vst));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (arr[i][j] == 'G') arr[i][j] = 'R';
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (!vst[i][j]) {
                dfs(i, j);
                cnt++;
            }
        }
    }
    cout << cnt;
}
