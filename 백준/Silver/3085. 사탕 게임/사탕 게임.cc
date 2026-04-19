#include <algorithm>
#include <iostream>
using namespace std;
int n, result;
string arr[50];

int checkCandy() {
    for (int i = 0; i < n; i++) {
        int cnt = 1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[i][j] == arr[i][j + 1]) {
                cnt++;
            } else {
                result = max(result, cnt);
                cnt = 1;
            }
        }
        result = max(result, cnt);
    }

    for (int i = 0; i < n; i++) {
        int cnt = 1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j][i] == arr[j + 1][i]) {
                cnt++;
            } else {
                result = max(result, cnt);
                cnt = 1;
            }
        }
        result = max(result, cnt);
    }

    return result;
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - 1; j++) {
            swap(arr[i][j], arr[i][j + 1]);
            result = max(result, checkCandy());
            swap(arr[i][j], arr[i][j + 1]);

            swap(arr[j + 1][i], arr[j][i]);
            result = max(result, checkCandy());
            swap(arr[j + 1][i], arr[j][i]);
        }
    }

    cout << result;
}
