#include <algorithm>
#include <iostream>

using namespace std;
int n, m, ans;
int net[101][101];
int kevin[101];

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m;
    cin >> n >> m;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i != j)
                net[i][j] = 100000;
        }
    }

    for (int i = 0; i < m; i++) {
        int x, y;
        cin >> x >> y;
        net[x][y] = 1;
        net[y][x] = 1;
    }

    for (int k = 1; k <= n; k++) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (net[i][k] != 100000 && net[k][j] != 100000)
                    net[i][j] = min(net[i][j], net[i][k] + net[k][j]);
            }
        }
    }


    long long minKevin = 100000;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            kevin[i] += net[i][j];
        }
        if (minKevin > kevin[i]) {
            minKevin = kevin[i];
            ans = i;
        }
    }
    cout << ans;
    return 0;
}
