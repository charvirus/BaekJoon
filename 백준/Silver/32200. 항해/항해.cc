#include <iostream>
using namespace std;
int n, x, y, ans, rem, inp, tmp;

int main(void) {
    ios::sync_with_stdio(false), cin.tie(NULL);
    cin >> n >> x >> y;
    for (int i = 0; i < n; i++) {
        cin >> inp;
        tmp = inp / x;
        ans += tmp;
        rem += max(inp - y * tmp, 0);
    }
    cout << ans << "\n" << rem;
}
