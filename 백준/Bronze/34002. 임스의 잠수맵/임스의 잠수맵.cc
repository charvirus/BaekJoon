#include <algorithm>
#include <iostream>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, c, s, v, l, ans = 0;
    cin >> a >> b >> c >> s >> v >> l;
    s *= 30;
    v *= 30;
    l *= 100;

    while (true) {
        if (l >= 25000) {
            cout << ans << endl;
            break;
        }
        if (v > 0) {
            v--;
            l += c;
        }else if (s > 0) {
            s--;
            l += b;
        } else {
            l += a;
        }
        ans++;
    }
}
