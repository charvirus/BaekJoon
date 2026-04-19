#include <algorithm>
#include <iostream>
using namespace std;
int n, m, sum;
int bus[101], map[101][101];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < m; i++) {
        cin >> bus[i];
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            cin >> map[i][j];
        }
    }
    for (int i = 1; i < m; i++) {
        sum += map[bus[i - 1]][bus[i]];
    }
    cout << sum;
}
