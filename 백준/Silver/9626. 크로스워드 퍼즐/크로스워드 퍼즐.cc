#include <iostream>
#include <climits>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int m, n, u, l, r, d;
    cin >> m >> n >> u >> l >> r >> d;
    char puz[m][n];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> puz[i][j];
        }
    }

    for (int i = 0; i < m + u + d; i++) {
        for (int j = 0; j < n + l + r; j++) {
            if (u <= i && i < u + m && l <= j && j < l + n) {
                cout << puz[i - u][j - l];
            } else {
                if ((i + j) % 2) {
                    cout << ".";
                } else {
                    cout << "#";
                }
            }
        }
        cout << "\n";
    }
}
