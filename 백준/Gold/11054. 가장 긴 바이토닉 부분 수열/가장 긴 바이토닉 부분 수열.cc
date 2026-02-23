#include <algorithm>
#include <cstring>
#include <iostream>
using namespace std;
int n, ans, arr[1001], adp[1001], ddp[1001];

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < n; i++) {
        adp[i] = 1;
        for (int j = 0; j < i; j++) {
            if (arr[i] > arr[j]) {
                adp[i] = max(adp[i], adp[j] + 1);
            }
        }
    }

    for (int i = n - 1; i >= 0; i--) {
        ddp[i] = 1;
        for (int j = n - 1; j >= i; j--) {
            if (arr[i] > arr[j]) {
                ddp[i] = max(ddp[i], ddp[j] + 1);
            }
        }
    }

    for (int i = 0; i < n; i++) {
        ans = max(ans, adp[i] + ddp[i] - 1);
    }
    cout << ans;
}
