#include <iostream>
using namespace std;
long l[10001], r[10001];
long x, k;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> x >> k;
    long ans = x * x;

    for (int i = 0; i < x; i++) {
        int inp;
        cin >> inp;
        l[inp]++;
    }
    for (int i = 0; i < x; i++) {
        int inp;
        cin >> inp;
        r[inp]++;
    }

    for (int i = 1; i <= k; i++) {
        ans -= l[i] * r[i];
    }
    cout << ans;
}
