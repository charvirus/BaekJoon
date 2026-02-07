#include <algorithm>
#include <iostream>
using namespace std;

int n, m, ans;
char arr[101][101];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (arr[i][j] != '.') {
                if (arr[i][j] == 'X' && arr[i][j + 1] == 'Y' && j+1<m) {
                    ans++;
                }
                if (arr[i][j] == 'X' && arr[i][j - 1] == 'Y'  && 0<=j-1) {
                    ans++;
                }
                if (arr[i][j] == 'X' && arr[i + 1][j] == 'Y' && i+1<n) {
                    ans++;
                }
                if (arr[i][j] == 'X' && arr[i - 1][j] == 'Y' && 0<=i-1) {
                    ans++;
                }
            }
        }
    }
    cout << ans << endl;
}
