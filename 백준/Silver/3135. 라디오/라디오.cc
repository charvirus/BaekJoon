#include <iostream>
using namespace std;

int main() {
    ios::sync_with_stdio(false), cin.tie(NULL);
    int a, b, n;
    cin >> a >> b;
    cin >> n;
    int ans = abs(a - b);
    for (int i = 0; i < n; i++) {
        int inp;
        cin >> inp;
        ans = min(abs(b - inp) + 1, ans);
    }
    cout << ans;
}
