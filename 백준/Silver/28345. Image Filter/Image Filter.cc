#include <algorithm>
#include <iostream>
#include <climits>
using namespace std;

int board[105][105], cboard[105][105][5], mx, cab, idx, t, r, c;

pair<int, int> calc(int x, int y) {
    mx = INT_MAX, cab = INT_MAX, idx = -1;
    for (int i = 0; i < 5; i++) {
        int ab = board[x][y] - cboard[x][y][i];
        if (abs(ab) < cab) {
            cab = abs(ab);
            mx = ab;
            idx = i;
        }
    }
    return {idx, mx};
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> t;
    while (t--) {
        cin >> r >> c;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                cin >> board[i][j];
                int A = (j - 1 < 0 ? 0 : board[i][j - 1]);
                int B = (i - 1 < 0 ? 0 : board[i - 1][j]);
                int C = (j - 1 < 0 || i - 1 < 0 ? 0 : board[i - 1][j - 1]);

                cboard[i][j][0] = 0;
                cboard[i][j][1] = A;
                cboard[i][j][2] = B;
                cboard[i][j][3] = (A + B) / 2;
                cboard[i][j][4] = A + B - C;

                auto [idx,ab] = calc(i, j);
                cout << idx << " " << ab << " ";
            }
            cout << "\n";
        }
    }
}
