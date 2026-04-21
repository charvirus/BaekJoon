#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

string w, arr[20][20];
int n;

char inputRev(int i) {
    if (i == 2) {
        return '5';
    } else if (i == 5) {
        return '2';
    } else if (i == 1 || i == 8) {
        return ('0' + i);
    } else {
        return '?';
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> w >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int inp;
            cin >> inp;
            if (w == "U" || w == "D") {
                arr[n - i - 1][j] = inputRev(inp);
            } else {
                arr[i][n - j - 1] = inputRev(inp);
            }
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << arr[i][j] << " ";
        }
        cout << "\n";
    }
}
