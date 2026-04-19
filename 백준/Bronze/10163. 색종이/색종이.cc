#include <iostream>

using namespace std;
int arr[1001][1001], cnt[101];

int n, sx, sy, ex, ey;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 1; i <= n; i++) {
        cin >> sx >> sy >> ex >> ey;
        for (int k = sy; k < sy + ey; k++) {
            for (int j = sx; j < sx + ex; j++) {
                arr[k][j] = i;
            }
        }
    }
    for (int i = 0; i <= 1000; i++) {
        for (int j = 0; j <= 1000; j++) {
            {
                if (arr[i][j] != 0) {
                    cnt[arr[i][j]]++;
                }
            }
        }
    }

    for (int i = 1; i <= n; i++) {
        cout << cnt[i] << "\n";
    }
}
