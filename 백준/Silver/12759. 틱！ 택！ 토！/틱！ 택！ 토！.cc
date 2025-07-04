#include <iostream>
#include <algorithm>

using namespace std;
int arr[3][3];

bool chk(int x) {
    if (arr[0][0] == x && arr[1][1] == x && arr[2][2] == x) return true;
    if (arr[0][2] == x && arr[1][1] == x && arr[2][0] == x) return true;
    for (int i = 0; i < 3; ++i) {
        if (arr[i][0] == x && arr[i][1] == x && arr[i][2] == x) return true;
        if (arr[0][i] == x && arr[1][i] == x && arr[2][i] == x) return true;
    }
    return false;
}

int main() {
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(false);

    int pn;
    cin >> pn;
    for (int a = 0; a < 9; a++) {
        int x, y;
        cin >> y >> x;
        arr[y - 1][x - 1] = pn;

        if (chk(pn)) {
            cout << pn << '\n';
            return 0;
        }
        if (pn == 1) {
            pn = 2;
        } else {
            pn = 1;
        }
    }
    cout << 0 << '\n';
    return 0;
}
