#include <cmath>
#include <iostream>
using namespace std;

int n, k, p, inp, cnt, ans;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> k >> p;
    for (int i = 1; i <= n * k; i++) {
        cin >> inp;
        cnt += inp;
        if (i % k == 0) {
            if (cnt >= p) {
                ans++;
            }
            cnt = 0;
        }
    }
    cout << ans;
}
