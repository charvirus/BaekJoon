#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int n, m, cnt;
char arr[50][50];
bool vst[50][50];

void dfs(int y, int x) {
    vst[y][x] = true;
    if (arr[y][x] == '-') {
        if (x + 1 < m && arr[y][x + 1] == '-') {
            dfs(y, x + 1);
        }
    } else {
        if (y + 1 < n && arr[y + 1][x] == '|') {
            dfs(y + 1, x);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (!vst[i][j]) {
                cnt++;
                dfs(i,j);
            }
        }
    }
    cout << cnt;
}
