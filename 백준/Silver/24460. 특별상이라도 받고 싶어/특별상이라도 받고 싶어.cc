#include <algorithm>
#include <iostream>
using namespace std;
int n, arr[1024][1024];

int req(int x, int y, int n) {
    int ans[4] = {0,};
    if (n >= 2) {
        ans[0] = req(x, y, n / 2);
        ans[1] = req(x + n / 2, y, n / 2);
        ans[2] = req(x, y + n / 2, n / 2);
        ans[3] = req(x + n / 2, y + n / 2, n / 2);
        sort(ans,ans+4);
        return ans[1];
    }else {
        return arr[x][y];
    }
}

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }
    cout << req(0, 0, n);
}
