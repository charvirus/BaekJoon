#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int n, m, k;
    cin >> n >> m >> k;
    int arr[n][m], sm[n] = {0,};
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            sm[j] += arr[j][i];
            if (sm[j] >= k) {
                cout<<j+1<<" "<<i+1;
                return 0;
            }
        }
    }
}
