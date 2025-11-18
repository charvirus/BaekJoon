#include <iostream>
using namespace std;

int n, mx = 1, cnt = 1, tmp = 1;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);

    cin >> n;
    int pre, inp;
    cin >> pre;
    for (int i = 1; i < n; i++) {
        cin >> inp;
        if (pre <= inp) {
            tmp++;
        } else {
            cnt++;
            tmp = 1;
        }
        pre = inp;
        mx = max(mx, tmp);
    }
    cout << cnt << " " << mx;
}