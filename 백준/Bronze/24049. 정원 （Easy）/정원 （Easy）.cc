#include <iostream>
#include <string.h>
using namespace std;

int n, m;
int arr[1001][1001]={0,};
int main(void) {
    cin >> n >> m;

    for (int i = 1; i <= n; i++) {
        cin >> arr[i][0];
    }
    for (int i = 1; i <= m; i++) {
        cin >> arr[0][i];
    }
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (arr[i][j - 1] == arr[i - 1][j]) {
                arr[i][j] = 0;
            } else {
                arr[i][j] = 1;
            }

        }
    }
    cout << arr[n][m] << '\n';
}
