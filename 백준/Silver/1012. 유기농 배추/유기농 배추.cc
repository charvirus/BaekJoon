#include <iostream>
#include <cstring>
using namespace std;
int arr[50][50] = {};

int dy[]={1,-1,0,0};
int dx[]={0,0,1,-1};

void dfs(int y, int x) {
    arr[y][x] = 0;
    for (int i = 0;i < 4;i++) {
        int ny = y + dy[i];
        int nx = x + dx[i];
        if (0 <= ny && ny < 50 && 0 <= nx && nx < 50 && arr[ny][nx] == 1) {
            dfs(ny, nx);
        }
    }
}

int main() {
    int n;
    cin >> n;
    while (n--) {
        int x, y, z, cnt = 0;
        cin >> y >> x >> z;
        for (int j = 0; j < z; j++) {
            int a, b;
            cin >> a >> b;
            arr[a][b] = 1;
        }
        for (int j = 0; j < y; j++) {
            for (int k = 0; k < x; k++) {
                if (arr[j][k] == 1) {
                    dfs(j, k);
                    cnt++;
                }
            }
        }
        memset(arr, 0, sizeof(arr));
        cout << cnt << '\n';
    }
}