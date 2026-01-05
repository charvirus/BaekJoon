#include <iostream>
using namespace std;

int gnd[1000][1000], chk[10][10];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m, r, c, cnt = 0;
    cin >> n >> m >> r >> c;
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < m; j++) 
            cin >> gnd[i][j];
    for (int i = 0; i < r; i++) 
        for (int j = 0; j < c; j++) 
            cin >> chk[i][j];

    for (int i = 0; i + r <= n; i++) {
        for (int j = 0; j + c <= m; j++) {
            int diff = gnd[i][j] - chk[0][0];
            bool flag = true;
            for (int y = 0; y < r; y++) 
                for (int x = 0; x < c; x++) 
                    if (flag) flag = (gnd[i + y][j + x] - chk[y][x]) == diff;
                
            cnt += flag;
        }
    }
    cout << cnt;
}