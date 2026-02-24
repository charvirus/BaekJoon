#include <algorithm>
#include <iostream>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    long n, x, b, wei = 0;
    cin >> n >> x;
    int a[n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < n; i++) {
        cin >> b;
        wei += b;
        if (wei < a[i]) {
            cout << -1;
            return 0;
        }
    }
    cout << (wei - a[n - 1]) / x;
}
