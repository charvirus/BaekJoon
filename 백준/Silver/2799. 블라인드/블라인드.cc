#include <cmath>
#include <iostream>
#include <set>
#include <vector>
using namespace std;
int m, n, res[5];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> m >> n;
    char arr[5 * m + 1][5 * n + 1];
    for (int i = 0; i < 5 * m + 1; i++) {
        cin >> arr[i];
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int cnt = 0;
            for (int y = 5 * i + 1; y < 5 * (i + 1); y++) {
                for (int x = 5 * j + 1; x < 5 * (j + 1); x++) {
                    if (arr[y][x] == '.') {
                        cnt++;
                    }
                }
            }
            if (cnt/4 == 4) {
                res[0]++;
            }else if (cnt/4==3) {
                res[1]++;
            }else if (cnt/4==2) {
                res[2]++;
            }else if (cnt/4==1) {
                res[3]++;
            }else {
                res[4]++;
            }
        }
    }

    for (int i = 0;i<5;i++) {
        cout<<res[i]<<" ";
    }
}
