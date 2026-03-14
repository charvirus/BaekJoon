#include <algorithm>
#include <iostream>
using namespace std;

int n, m, q, arr[3001][3001], sp[3001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m >> q;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }
    for (int i = 0; i < n; i++) {
        sp[i] = i;
    }
    for (int i = 0; i < q; i++) {
        int inp, y, x, k;
        cin >> inp;
        if (inp == 0) {
            cin >> y >> x >> k;
            arr[sp[y]][x] = k;
        } else {
            cin >> y >> x;
            swap(sp[y],sp[x]);
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << arr[sp[i]][j] << " ";
        }
        cout << "\n";
    }
}
