#include <algorithm>
#include <iostream>
using namespace std;

int n, k, inp;
int arr[100][100];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> k;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> inp;
            if (inp == 1) {
                int sy = i * k;
                int sx = j * k;
                for (int si = sy; si < sy + k; si++) {
                    for (int sj = sx; sj < sx + k; sj++) {
                        arr[si][sj] = 1;
                    }
                }
            }
        }
    }
    for (int i = 0; i < n * k; i++) {
        for (int j = 0; j < n * k; j++) {
            cout << arr[i][j] << " ";
        }
        cout << "\n";
    }
}
